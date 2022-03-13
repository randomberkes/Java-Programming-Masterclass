package com.randomberkes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
        int sum = 0;
        Scanner myScanner = new Scanner(System.in);
        while (count < 10){
            System.out.println("Enter number #" + (count + 1));
            if(myScanner.hasNextInt()){
                count ++;
                sum += myScanner.nextInt();
            }else{
                System.out.println("Invalid number");
            }
            myScanner.nextLine();
        }
        System.out.println("sum = " + sum);
        myScanner.close();
    }
}
