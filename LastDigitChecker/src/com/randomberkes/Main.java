package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));

    }
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if(!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)){
            return false;
        }
        if(firstNumber % 10 == secondNumber % 10){
            return true;
        }
        if(firstNumber % 10 == thirdNumber % 10){
            return true;
        }
        if(thirdNumber % 10 == secondNumber % 10){
            return true;
        }
        return false;
    }

    public static boolean isValid(int number){
        if(number >= 10 && number <= 1000){
            return true;
        } else{
            return false;
        }
    }

}
