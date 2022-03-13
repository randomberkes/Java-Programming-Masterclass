package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        int firstIntNumber = (int)(firstNumber * 1000);
        int secondIntNumber = (int)(secondNumber * 1000);
        if(firstIntNumber == secondIntNumber){
            return true;
        }else{
            return false;
        }
    }
}
