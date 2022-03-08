package com.codewithmurali;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<String> fileList;
        String pattern;

        File file = new File("/home/murakr");

        fileList = List.of(file.list());

        do{
            System.out.println("enter the pattern you want to search");
            pattern = sc.nextLine().toLowerCase();
            if(pattern == "-1")
               return ;
            Pattern p = Pattern.compile("[^\\s]*"+pattern+"[^\\s]*",Pattern.CASE_INSENSITIVE);

            for(String name:fileList){
                if(p.matcher(name).matches()){//name.toLowerCase().contains(pattern)
                    System.out.println(name);
                    System.out.println("Path: "+ file.getAbsolutePath()+ "/"+name);
                }
            }
            System.out.println("do u want to continue");

        }while(sc.nextLine().charAt(0)=='y');
    }
}

