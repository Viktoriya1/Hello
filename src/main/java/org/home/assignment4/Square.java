package org.home.assignment4;

public class Square {
    double side;

     public Square(double side) {
        this.side = side;
    }

    protected double getPerimeter() {
        double perimeter = 4 * side;
        return perimeter;
    }

    protected double getArea() {
        double area = side * side;
        return area;
    }
}
