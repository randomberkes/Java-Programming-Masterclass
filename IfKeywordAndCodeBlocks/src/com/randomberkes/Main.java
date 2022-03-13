package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000) {
//            System.out.println("Your score was less then 5000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than  1000");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //Challenge
        //Print out a second score ont the screen with the following
        //score set to 10000
        //levelCompleted set to 8
        //bonus set to 200
        //But make sure first printout above still displays as well

        if (gameOver) {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
