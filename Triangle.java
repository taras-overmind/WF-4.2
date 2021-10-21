package com.App;


public class Triangle extends Figure {
    private  double side1, side2, side3;
    Triangle(double s1, double s2, double s3){
        side1=s1; side2=s2; side3=s3;
    }
    double calcPerimeter() {
        perimeter=side1+side2+side3;
        return perimeter;
    }
    double calcSquare() {
        double p=calcPerimeter()/2;
        square=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return square;
    };

}
