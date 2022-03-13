package com.randomberkes;

import java.sql.SQLOutput;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 4;

        switch(switchValue){//(byte, short, char, int)
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }

        //challenge

        char switchCharValue = 'G';

        switch(switchCharValue){
            case 'A':
                System.out.println("It was an " + switchCharValue);
                break;
            case 'B':
                System.out.println("It was an " + switchCharValue);
                break;
            case 'C':
                System.out.println("It was an " + switchCharValue);
                break;
            case 'D':
                System.out.println("It was an " + switchCharValue);
                break;
            case 'E':
                System.out.println("It was an " + switchCharValue);
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month = "January";
        switch(month.toLowerCase(Locale.ROOT)){
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
