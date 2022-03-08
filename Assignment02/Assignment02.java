/* Write a java function that checks if the input string contains all the letters of
the alphabet a-z (case-insensitive). Write time and space complexity of your solution
 as comments in the source file.
 -----------------------------------
 Time complexity of the solution is O(n) where n is length of inputString

 */



package com.codewithmurali;

import java.util.Locale;
import java.util.Scanner;

public class Assignment02 {



    public static void main(String[] args) {
        char[] inputString;
        Scanner scanner = new Scanner(System.in);
        inputString = scanner.nextLine().toLowerCase().toCharArray();
        int sum=0;
        int[] alphabet = new int[26];
        for(int i = 0;i<inputString.length;i++){
            int charInAlphabet = (int)(inputString[i]-'a');
            if(charInAlphabet >= 0 && charInAlphabet <=25)
                alphabet[charInAlphabet] =1;

        }

        for(int i : alphabet){
            sum+= i;
        }
        if(sum==26)
            System.out.println("given string is a pangram");
        else
            System.out.println("given string is not a pangram");
    }

}
