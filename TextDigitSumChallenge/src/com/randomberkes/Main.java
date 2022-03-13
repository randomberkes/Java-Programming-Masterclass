package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(456));
        System.out.println(sumDigits(1));
    }

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int digit;
        int remainingDigits = number;
        int sum = 0;
        while(remainingDigits > 0){
            digit = remainingDigits % 10;
            remainingDigits = remainingDigits / 10;
            sum = sum + digit;
        }
        return sum;
    }
}
