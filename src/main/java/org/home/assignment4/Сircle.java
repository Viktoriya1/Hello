package org.home.assignment4;

public class Сircle {

    public static final double PI = 3.14;
    double r;

    public Сircle(double r) {
        this.r = r;
    }


    protected  double getPerimeter() {
        double perimeter = 2 * PI * r;
        return perimeter;
    }

    protected  double getArea() {
        double area = PI*r*r;
        return area;
    }


}
