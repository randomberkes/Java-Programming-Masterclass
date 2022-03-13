package com.randomberkes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int number;

        while(true){
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                number = scanner.nextInt();
                if(min > number) min = number;
                if(max < number) max = number;
            }else{
                break;
            }

        }
        scanner.close();
        System.out.println("minimum number := " + min + ", maximum number := " + max);
    }
}
