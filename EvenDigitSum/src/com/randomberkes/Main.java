package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int digit;
        int remainingDigits = number;
        int sum = 0;
        while (remainingDigits != 0){
            digit = remainingDigits % 10;
            remainingDigits /= 10;
            if(digit % 2 == 0){
                sum += digit;
            }
        }
        return sum;
    }
}
