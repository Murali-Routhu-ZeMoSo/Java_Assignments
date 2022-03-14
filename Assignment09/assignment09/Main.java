package com.codewithmurali.assignment09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "[A-Z].*[.]";
        Pattern p = Pattern.compile(regex);
        String inputString = sc.nextLine();
        Matcher m = p.matcher(inputString);
        if(m.matches()){
            System.out.println("matches");
        }
        else
            System.out.println("doesn't match");

    }
}
