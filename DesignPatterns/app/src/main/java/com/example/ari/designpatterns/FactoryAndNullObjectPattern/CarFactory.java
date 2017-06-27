package com.example.ari.designpatterns.FactoryAndNullObjectPattern;

/**
 * Created by Ari on 6/25/2017.
 */

public class CarFactory {

    public Car getInstance(String s){

        Car c;

        if(s.equalsIgnoreCase("SUV")){
            c = new SUV();
        }
        else if(s.equalsIgnoreCase("sports car")){
            c = new SportsCar();
        }
        else if (s.equalsIgnoreCase("sedan")){
            c = new Sedan();
        }
        //MEANT TO HANDLE ANY OCCURRENCE NOT COVERED BY OTHER SCENARIOS
        else{
            c = new NullCar();
        }
        return c;
    }



}
