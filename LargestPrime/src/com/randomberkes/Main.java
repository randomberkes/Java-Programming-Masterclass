package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number < 0) return -1;

        boolean isPrime = true;
        for (int i = number; i >= 2; i--) {
            if (number % i == 0) {
                isPrime = true;
                for (int j = 2; i / 2 >= j; j++) {
                    if (i % j == 0) isPrime = false;
//                    System.out.println("fasz2");

                }
                if (isPrime) return i;
//                System.out.println("fasz");
            }

        }
        return -1;
    }
}
