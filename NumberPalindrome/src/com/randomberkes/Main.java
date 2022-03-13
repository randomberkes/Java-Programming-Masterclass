package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number){
        int digit;
        int remainingDigits = number;
        int reverse = 0;
        while (remainingDigits != 0){
            digit = remainingDigits % 10;
            remainingDigits = remainingDigits / 10;
            reverse *= 10;
            reverse += digit;
        }

        return reverse == number;
    }
}
