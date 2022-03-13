package com.randomberkes;

public class Main {

    public static void main(String[] args) {
	    printEqual(1, 1, 1);
	    printEqual(1, 1, 2);
	    printEqual(-1, -1, -1);
	    printEqual(1, 2, 3);
    }

    public static void printEqual(int firstNUmber, int secondNUmber, int thirdNUmber){
        if(firstNUmber < 0 || secondNUmber < 0 || thirdNUmber < 0){
            System.out.println("Invalid Value");
        }else if(firstNUmber == secondNUmber && secondNUmber == thirdNUmber){
                System.out.println("All numbers are equal");
            }else if(firstNUmber != secondNUmber && secondNUmber != thirdNUmber && firstNUmber != thirdNUmber){
                System.out.println("All numbers are different");
            }else{
                System.out.println("Neither all are equal or different");
            }
    }
}
