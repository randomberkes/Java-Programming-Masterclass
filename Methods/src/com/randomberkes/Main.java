package com.randomberkes;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);


        highScore = calculateScore(gameOver, 10000, 8, 200);
        System.out.println("Your final score was: " + highScore);

        displayHighScorePosition("Nezuko", calculateHighScorePosition(1500));

        displayHighScorePosition("Tanjiro", calculateHighScorePosition(900));

        displayHighScorePosition("Inosuke", calculateHighScorePosition(400));

        displayHighScorePosition("Zenitsu", calculateHighScorePosition(50));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            return -1;
        }
    }

    //Create a method called displayHighScorePosition
    //it should take a players nam as a parameter, and a 2nd parameter as a position int the high score table
    //You should display the players name along with a message like" managed to get into position " and the
    //position they got and a further message " on the high score table " .
    //
    //Create a 2nd method called calculateHighScorePosition
    //it should be sent one argument only, the player score
    //it should return an int
    //1 if the score is > 1000
    //2 if the score is > 500 and < 1000
    //3 if the score is > 100 and < 500
    //4 in all other, cases
    //call both methods and display the results of the following
    //a score of 1500, 900, 400, and 50

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name
                + " managed to get into position "
                + position
                + " on the high score table ");
    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//
//        return 4;

        int position  = 4;

        if(score >= 1000){
            position = 1;
        }else if (score >= 500){
            position = 2;
        }else if (score >= 100){
            position = 3;
        }

        return position;
    }


}
