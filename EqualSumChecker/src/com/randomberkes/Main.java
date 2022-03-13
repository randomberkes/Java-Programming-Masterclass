package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));


    }

    public static boolean hasEqualSum(int firstValue, int secondValue, int sumValue){
        if(firstValue + secondValue == sumValue){
            return true;
        }else{
            return false;
        }
    }
}
