package com.randomberkes;

public class Ford extends Car{
    private int roadServiceMonths;

    public Ford(int wheels, int doors, int gears, boolean isManual, int roadServiceMonths) {
        super("Outlander", "4WD", wheels, doors, gears, isManual);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity ==  0){
            stop();
        }else if(newVelocity > 0 && newVelocity <= 10){
           setCurrentGear(1);
        }else if(newVelocity > 10 && newVelocity <= 20){
            setCurrentGear(2);
        }else if(newVelocity > 20 && newVelocity <= 30){
            setCurrentGear(3);
        }else{
            setCurrentGear(4);
        }

        if(newVelocity > 0){
            chan
        }
    }
}
