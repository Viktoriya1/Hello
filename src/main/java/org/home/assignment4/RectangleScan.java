package org.home.assignment4;

import java.util.Scanner;

public class RectangleScan {

    public static void getParam() {
        Scanner console = new Scanner(System.in);
        System.out.println("Вы выбрали прямоугольник.");
        System.out.println("Введите длину боковой грани:");
        double height = console.nextDouble();
        System.out.println("Введите длину верхней грани:");
        double width = console.nextDouble();
        Rectangle r = new Rectangle(height,width);
        System.out.printf("Длина боковой грани: = %s%nДлина верхней грани: = %s%nПериметр прямоугольника: = %s%nПлощадь прямоугольника: = %s", height, width, r.getPerimeter(),r.getArea());
    }
}
