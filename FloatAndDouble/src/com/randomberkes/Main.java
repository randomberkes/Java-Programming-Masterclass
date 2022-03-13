package com.randomberkes;

public class Main {

    public static void main(String[] args) {

//float (32 bit)
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

//double (64 bit)(default for decimal numbers)
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

//chalange start
        float myFloatValue2 = (float)5.25;
//end

        System.out.println("My Int Value= "  + myIntValue);
        System.out.println("My Float Value= "  + myFloatValue);
        System.out.println("My Double Value= "  + myDoubleValue);

//chalange start
        double pounds = 200;
        double kilograms = pounds * 0.45359237;
        System.out.println(pounds + " pounds in kilograms are " + kilograms);
//end
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
