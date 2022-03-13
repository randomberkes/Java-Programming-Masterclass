package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));

    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        int remainingDigits = number;
        while(remainingDigits != 0){
            firstDigit = remainingDigits % 10;
            remainingDigits /= 10;
        }
        return firstDigit + lastDigit;

    }
}
