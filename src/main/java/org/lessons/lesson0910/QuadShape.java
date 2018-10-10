package org.lessons.lesson0910;

public class QuadShape extends  Shape {


    protected QuadShape(int x, int y, String color) {
        super(x, y, color);
    }

    @Override
    public float getSquare() {
        return 0;
    }

    @Override
    public float getPerimeter() {
        return 0;
    }
}
