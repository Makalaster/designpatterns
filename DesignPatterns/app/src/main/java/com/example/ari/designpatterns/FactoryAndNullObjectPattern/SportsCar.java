package com.example.ari.designpatterns.FactoryAndNullObjectPattern;

/**
 * Created by Ari on 6/25/2017.
 */

public class SportsCar implements Car{
    @Override
    public void speak() {
        System.out.print("I am a Sports Car");
    }
}
