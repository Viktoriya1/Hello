package org.lessons.lesson0910;

public class CircleShape extends Shape{

    private  final int radius;

    protected CircleShape(int x, int y, String color,int radius) {
        super(x, y, color);
        this.radius=radius;
    }


    @Override
    public float getSquare() {
        return 2*3.1415f*radius;
    }

    @Override
    public float getPerimeter() {
        return 2*3.1415f*radius*radius;
    }


    public int getRadius(){
        return radius;
    }
}


