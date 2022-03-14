package com.codewithmurali.assignment11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CharacterFreqToFile {
    static Map<Character,Integer> charfrequency = new TreeMap<>();
    static FileWriter fw;
    static void mapTheChar(char key){
        if(charfrequency.containsKey(key)){
            int freq= charfrequency.get(key);
            charfrequency.put(key,++freq);
        }
        else{
            charfrequency.put(key,1);
        }

    }
    static void writeToFile() throws IOException {
        fw.write("{");
        Set<Character> keys  = charfrequency.keySet();
        for(Character key : keys)
        {
            fw.write(key+"="+charfrequency.get(key)+", ");

        }
        fw.write("}");

    }

    public static void main(String[] args) throws IOException {

        File inputFile = new File(args[0]);
        Scanner sc = new Scanner(inputFile);

        fw = new FileWriter("output.txt");
        while(sc.hasNext()) {
            char[] inputString = sc.next().toLowerCase().toCharArray();
            for (int i = 0; i < inputString.length; i++) {
                mapTheChar(inputString[i]);
            }
        }
        writeToFile();
        fw.close();
        sc.close();
    }
}

