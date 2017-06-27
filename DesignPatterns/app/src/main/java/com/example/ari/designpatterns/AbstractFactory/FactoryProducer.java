package com.example.ari.designpatterns.AbstractFactory;

/**
 * Created by Ari on 6/26/2017.
 */


//THIS WILL PROVIDE US WITH THE PROPER FACTORY BASED ON OUR CHOICE
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();

        }else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }

        return null;
    }
}