package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;//statement

        if (myVariable == 50) {
            System.out.println("Printed");
        }
        myVariable--;//statement
        myVariable++;//statement
        System.out.println("This is a test");//statement

        System.out.println("This is " +
                "another " +
                "still more");//statement

        int anotherVariable = 50; myVariable--;//two statements

        System.out.println("This is another one");//statement
    }
}
