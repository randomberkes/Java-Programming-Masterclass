package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0){
            return false;
        }

        int bigBag = 5;
        int smallBag = 1;

        if((bigCount * bigBag) + (smallCount * smallBag) >= goal){
            for(int i = 0; i <= bigCount; i++){
                for (int j = 0; j <= smallCount; j++){
                    if((bigBag * i) + (smallBag * j) == goal)
                        return true;
                }
            }
        }
        return false;
    }
}
