package com.codewithmurali;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment03 {
    public static void runCommand(String command)  {
        String responseLine="";
        ArrayList<Float> durationArray= new ArrayList<>();
        try{
            Process ping = Runtime.getRuntime().exec(command);
            BufferedReader responseStream = new BufferedReader(new InputStreamReader(ping.getInputStream()));
            System.out.println(responseStream.readLine());
            while ((responseLine = responseStream.readLine())!=null){
                System.out.println(responseLine);
                int indexOfTime = responseLine.indexOf("time=");
                int indexOfMs = responseLine.lastIndexOf("ms");
                if(indexOfTime!=-1 && indexOfMs!=-1){
                    durationArray.add(Float.parseFloat(responseLine.substring(indexOfTime+5,indexOfMs-1)));
                }
            }
            Collections.sort(durationArray);
            System.out.println(durationArray);
            int midIndex = durationArray.size()/2;
            if(durationArray.size()%2==0){
                System.out.println("the median is:"+ (durationArray.get(midIndex)+durationArray.get(midIndex-1))/2);
            }
            else{
                System.out.println("the median is:"+ durationArray.get(midIndex));

            }


        }catch (IOException io){
            System.out.println(io.getMessage());
        }
        catch (SecurityException se){
            System.out.println(se.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ipAddress;
        int noOfPings;
        System.out.println("Enter the ip address or domain name you want to ping");
        ipAddress = sc.nextLine();
        System.out.println("enter how many times you want to ping");
        noOfPings = sc.nextInt();
        runCommand("ping -c"+noOfPings+" "+ipAddress);

    }
}
