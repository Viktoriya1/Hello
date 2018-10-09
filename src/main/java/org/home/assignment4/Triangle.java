package org.home.assignment4;

public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    protected  double getPerimeter() {
        double perimeter = a+b+c;
        return perimeter;
    }

    protected  double getArea() {
        double p=(a+b+c)/2;
        double area = (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        return area;
    }

}
