package com.randomberkes;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;
	    //single linecomment
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        //result = result + 1;
        result++;
        System.out.println("1 + 1 = " + result);

        //result = result -1;
        result--;
        System.out.println("2 - 1 = " + result);

        //result = result + 2;
        result += 2;
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = " + result);

        //result = result / 3;
        result /= 3;
        System.out.println("30 / 3 = " + result);

        //result = result - 2;
        result -= 2;
        System.out.println("10 - 2 = " + result);


        boolean isAline = false;
        if(isAline == false){
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Grater then second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar = true){
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;

        if(wasCar){
            System.out.println("wasCar is true");
        }

//chalange
        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double thirdVariable = (firstVariable + secondVariable) * 100.00d;
        System.out.println("my values total is : " + thirdVariable);
        double modulusVariable = thirdVariable % 40.00d;
        System.out.println("the remainder is : " + modulusVariable);
        boolean booleanVariable = (modulusVariable == 0) ? true : false;
        System.out.println(booleanVariable);
        if(!booleanVariable){
            System.out.println("Got some remainder");
        }


    }
}
