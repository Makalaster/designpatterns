package com.example.ari.designpatterns.AbstractFactory;

/**
 * Created by Ari on 6/26/2017.
 */

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
