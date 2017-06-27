package com.example.ari.designpatterns.AbstractFactory;

/**
 * Created by Ari on 6/26/2017.
 */

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle:draw() method.");
    }
}
