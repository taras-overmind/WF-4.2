package com.App;

public class Square extends Figure{
    private double side;
    public Square(double a) {
        side=a;
    }

    double calcSquare() {
        square=side*side;
        return square;
    }
    double calcPerimeter() {
        perimeter=4*side;
        return perimeter;
    }
}
