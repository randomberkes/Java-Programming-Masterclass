package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }

        int minimum = first < second ? first : second;
        int maximum = first > second ? first : second;
        int i;
        for(i = minimum; i >= 2; i--){
            if(minimum % i == 0 && maximum % i == 0){
                break;
            }
        }
        return i;
    }
}
