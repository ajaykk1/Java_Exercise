package com.stackroute.loops;
import java.lang.Math;

import java.util.Scanner;

public class LongestSequence {
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        new LongestSequence().inputAcceptor();
    }

    //write logic to get inputs from user and send inputs to inputValidator
    public void inputAcceptor() {
        int sequence=scanner.nextInt();
        inputValidator(sequence);
    }

    //write logic to get inputs from user and send inputs to findLongestSequence
    public void inputValidator(int number) {
        if(number<0){
            System.out.println("Give proper input not negative number");
        }
        else if(number==0) {
            System.out.println("Give proper input not zero");
        }
        else {
            int result=findLongestSequence(number);
                outputPrinter(result);
        }
    }

    //write logic to longest sequence of zeros in binary representation of given number , returns result
    public int findLongestSequence(int number) {
        int ans=0,count=0;
        while (number>0){
            int temp=number%2;
            number=number/2;
            if(temp==1){
                ans=Math.max(ans,count);
                count=0;
            }
            else {
                count++;
            }
        }
       ans=Math.max(ans,count);
        System.out.println(ans);
        return ans;
    }

    //write logic to print the given printStatement
    public void outputPrinter(Object printStatement) {
        System.out.println(printStatement);
    }
}
