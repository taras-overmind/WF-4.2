package com.App;

public class Rhombus extends Figure {
    private  double side, angle_rad;

    public Rhombus(double side, double angle_rad) {
        this.side = side;
        this.angle_rad = angle_rad;
    }



    double calcSquare() {
        square=side*side*Math.sin(angle_rad);
        return square;
    }


    double calcPerimeter() {
        perimeter=4*side;
        return perimeter;
    }
}
