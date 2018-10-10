package org.lessons.lesson0910;

public abstract class Shape {


    //Позиция центра фигуры по координате x
    protected final int x;

    //Позиция центра фигуры по координате y

    protected final int y;


    //Цвет фигуры

    protected final String color;


    protected Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }


    public int getX() {
        return x;
    }

    public int gety() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public abstract float getSquare();

    public abstract float getPerimeter();




}
