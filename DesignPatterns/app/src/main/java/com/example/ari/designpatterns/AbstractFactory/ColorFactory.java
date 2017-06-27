package com.example.ari.designpatterns.AbstractFactory;

/**
 * Created by Ari on 6/26/2017.
 */
//ONE OF THE TWO FACTORIES THE ABSTRACTFACTORY WILL PRODUCE
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
