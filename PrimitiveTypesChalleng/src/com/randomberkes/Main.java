package com.randomberkes;

public class Main {

    public static void main(String[] args) {

        byte byteVariable = 12;
        short shortVariable = 13;
        int intVariable = 14;
        long longVariable = 50000L + 10L * (byteVariable + shortVariable + intVariable);
        System.out.println(longVariable);

        short shortTotal = (short)(1000 + 10 * (byteVariable + shortVariable + intVariable));
    }
}
