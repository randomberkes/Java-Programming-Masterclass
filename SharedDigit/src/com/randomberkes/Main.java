package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }
        int firstNumberDigit;
        int secondNumberDigit;
        int firstNumberRemainingDigits = firstNumber;
        int secondNumberRemainingDigits = secondNumber;
        boolean sharedDigit = false;

        while (firstNumberRemainingDigits != 0) {
            firstNumberDigit = firstNumberRemainingDigits % 10;
            firstNumberRemainingDigits /= 10;
            secondNumberRemainingDigits = secondNumber;
            while (secondNumberRemainingDigits != 0) {
                secondNumberDigit = secondNumberRemainingDigits % 10;
                secondNumberRemainingDigits /= 10;
                if (firstNumberDigit == secondNumberDigit) sharedDigit = true;
            }
        }

        return sharedDigit;
    }
}
