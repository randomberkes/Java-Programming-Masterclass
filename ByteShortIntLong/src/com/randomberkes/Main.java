package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        
    //long (64 bit)
        System.out.println("Long :");

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("My Long Value = " + myLongValue);
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        System.out.println("");
        
	//int (32 bit)
        System.out.println("Integer :");

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        System.out.println("Busted Maximum Value = " + (myMinIntValue + 1));
        System.out.println("Busted Minimum Value = " + (myMinIntValue - 1));

        int myTestNumber = 2_147_483_647;

        System.out.println("");
        
    //short (16 bit)
        System.out.println("Short :");

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        System.out.println("");

    //byte (8 bit)
        System.out.println("Byte :");

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        System.out.println("");

    //Casting
        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte)(myMinIntValue / 2);

        short myNewShortValue = (short)(myMinShortValue / 2);

    }
}
