package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));

    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber){
        if((firstNumber <= 19 && firstNumber >= 13)
                || (secondNumber <= 19 && secondNumber >= 13)
                || (thirdNumber <= 19 && thirdNumber >= 13)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isTeen(int firstNumber){
        if(firstNumber <= 19 && firstNumber >= 13){
            return true;
        }else{
            return false;
        }
    }
}
