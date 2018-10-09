package org.home.assignment4;

public class Rectangle {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    protected double getPerimeter() {
        double perimeter = 2 * (height + width);
        return perimeter;
    }

    protected double  getArea (){
        double area=height*width;
        return area;
    }

}