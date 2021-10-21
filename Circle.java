package com.App;

public class Circle extends Figure {
    private double rad;
    Circle(double rad){
        this.rad=rad;
    }
    double calcPerimeter() {
        perimeter=2*Math.PI*rad;
        return perimeter;
    }
    double calcSquare() {
        square=Math.PI*rad*rad;
        return square;
    }

}