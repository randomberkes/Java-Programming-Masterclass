package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);


    }

    public static void numberToWords(int number){
        if(number < 0) System.out.println("Invalid Value");
        if(number == 0) System.out.print("Zero ");

        int digit;
        int remainingDigits = reverse(number);
        while(remainingDigits != 0){
            digit = remainingDigits % 10;
            remainingDigits /= 10;
            switch (digit){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
        }
        for(int i = getDigitCount(reverse(number)) + 1; i <= getDigitCount(number); i++){
            System.out.print("Zero ");
        }
        System.out.println();
    }

    public static int reverse(int number) {
        int digit;
        int newNumber = 0;
        int remainingDigits = number;
        while (remainingDigits != 0) {
            digit = remainingDigits % 10;
            remainingDigits /= 10;
            newNumber *= 10;
            newNumber += digit;
        }
        return newNumber;
    }

    public static int getDigitCount(int number){
        if( number < 0) return -1;
        if(number == 0) return 1;

        int digit;
        int newNumber = 0;
        int remainingDigits = number;
        int numberOfDigits = 0;
        while (remainingDigits != 0) {
            digit = remainingDigits % 10;
            remainingDigits /= 10;
            numberOfDigits++;
        }
        return numberOfDigits;
    }
}
