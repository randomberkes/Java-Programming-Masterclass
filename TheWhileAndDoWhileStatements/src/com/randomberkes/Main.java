package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count <= 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        for (int i = 1; i < 7; i++) {
            System.out.println("Count value is " + i);
        }

        count = 1;
        while (true) {
            if (count <= 6) {
                break;
            }
            System.out.println("Count  value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count <= 6);

        int number = 4;
        int finishNumber = 20;
        int count2 = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEven(number)) {
                continue;
            }
            count2++;
            System.out.println("Even number " + number);

            if (count2 == 5) {
                break;
            }
        }
        System.out.println("Number of even numbers found " + count2);

        //challenge
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
