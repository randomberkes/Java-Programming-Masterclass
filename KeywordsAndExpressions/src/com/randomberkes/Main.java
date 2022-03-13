package com.randomberkes;

public class Main {

    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if(highScore == 50){
            System.out.println("This is an expression");
        }

        //challenge
        //In the following code that I will type below, write dow what parts of code
        //are expressions
        int score  = 100;
        if(score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }

        //1.expression : score  = 100
        //2.expression : score > 99
        //3.expression : "You got the high score!"
        //4.expression : score = 0
    }
}
