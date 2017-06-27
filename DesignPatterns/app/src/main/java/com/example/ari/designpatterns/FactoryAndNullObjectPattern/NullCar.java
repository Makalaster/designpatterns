package com.example.ari.designpatterns.FactoryAndNullObjectPattern;

/**
 * Created by Ari on 6/26/2017.
 */
//THIS CLASS HANDLES SCENARIOS OTHER THAN THOSE COVERED BY THE OTHER 3 CAR CLASSES, AS A DEFAULT
class NullCar implements Car{
    @Override
    public void speak() {
        System.out.print("Not an option!!!");
    }
}
