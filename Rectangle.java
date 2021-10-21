package com.App;


public class Rectangle extends Figure {
    private double side1, side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }


    double calcSquare() {
        square=side1*side2;
        return square;
    }


    double calcPerimeter() {
        perimeter= 2*side1+2*side2;
        return perimeter;
    }
}
