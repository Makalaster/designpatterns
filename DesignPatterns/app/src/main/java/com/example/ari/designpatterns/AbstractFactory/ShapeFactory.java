package com.example.ari.designpatterns.AbstractFactory;

/**
 * Created by Ari on 6/26/2017.
 */

//ONE OF THE TWO FACTORIES THE ABSTRACTFACTORY WILL PRODUCE
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){

        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}