package org.lessons.lesson0910;

public class Shapes {


    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        float perimeter = 0f;
        float square = 0f;

        for (Shape shape : shapes) {

            perimeter += shape.getPerimeter();
            square += shape.getSquare();

        }


        Shape quad = new QuadShape(10, 20, "RED");
        Shape circle = new CircleShape(25, 20, "Green", 3);


    }
}
