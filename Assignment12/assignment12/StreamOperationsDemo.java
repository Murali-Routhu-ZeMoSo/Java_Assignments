package com.codewithmurali.assignment12;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamOperationsDemo {
    static List<Student> studentList;
    static void printAllDepartments(){
        System.out.println("1. List of departments");
        studentList.stream().map(Student::getEngDepartment).distinct().forEach(System.out::println);
    }

    static void enrolledAfter2018(){
        studentList.stream().filter(student -> student.getYearOfEnrollment() > 2018).map(Student::getName).forEach(System.out::println);
    }

    static void malesFromCSDepartment(){
        Predicate<Student> isMaleCS = s -> (s.getEngDepartment().compareToIgnoreCase("Computer Science")==0)
                && (s.getGender().compareToIgnoreCase("male")==0);
        studentList.stream().filter(isMaleCS).map(Student::getName).forEach(System.out::println);
    }

    static void countMaleFemale(){
        System.out.println(studentList.stream().collect(Collectors
                .groupingBy(Student::getGender,Collectors.counting())));
    }

    static void avgMaleFemalePercentage(){
        System.out.println(studentList.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingDouble(Student::getPercentageTillDate))));
    }

    static void topper(){
        var topper = studentList.stream()
                .max(Comparator.comparing(Student::getPercentageTillDate))
                .orElse(studentList.get(0));
        System.out.println(topper);
    }

    static void departmentTotal(){
        System.out.println(studentList.stream().collect(Collectors
                .groupingBy(Student::getEngDepartment,Collectors.counting())));

    }
    static void deptAverage(){
        System.out.println(studentList.stream()
                .collect(Collectors.groupingBy(
                        Student::getEngDepartment,
                        Collectors.averagingDouble(Student::getPercentageTillDate)
                        )
                )
        );
    }

    static void youngestElectricalMale(){
        Predicate<Student> isMale = s->s.getGender().compareToIgnoreCase("male")==0
                && s.getEngDepartment().compareToIgnoreCase("Electronic")==0;
        System.out.println(studentList.stream().filter(isMale).min(Comparator.comparing(Student::getAge)).orElse(null));
    }

    static void maleFemaleFromCS(){
        Predicate<Student> isCS = s-> s.getEngDepartment().compareToIgnoreCase("Computer Science")==0;
        System.out.println(studentList.stream().filter(isCS).collect(Collectors
                .groupingBy(Student::getGender,Collectors.counting())));
    }

    public static void main(String[] args) {
        studentList = PopulateStudentList.getAll();
        printAllDepartments();
        enrolledAfter2018();
        malesFromCSDepartment();
        countMaleFemale();
        avgMaleFemalePercentage(); //5.What is the average age of male and female students?
        topper();
        departmentTotal();
        deptAverage();     //8. What is the average percentage achieved in each department?
        youngestElectricalMale();
        maleFemaleFromCS();



    }
}
