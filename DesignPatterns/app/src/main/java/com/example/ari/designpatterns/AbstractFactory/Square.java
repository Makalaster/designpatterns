package com.example.ari.designpatterns.AbstractFactory;

/**
 * Created by Ari on 6/26/2017.
 */

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square:draw() method.");
    }
}
