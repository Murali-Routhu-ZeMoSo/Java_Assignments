package com.codewithmurali.assignment09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {
    static boolean checkForMatch(String regex, String input){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return  m.matches();
    }

    public static void main(String[] args) {
        String regex = "[A-Z].*[.]";
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        boolean isMatching = checkForMatch(regex,inputString);

        if(isMatching) System.out.println("matches");
        else System.out.println("Doesn't match");




    }
}
