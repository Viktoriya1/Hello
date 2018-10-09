package org.home.assignment4;

import java.util.Scanner;

public class CircleScan {
    public static void getParam() {
        Scanner console = new Scanner(System.in);
        System.out.println("Вы выбрали круг.");
        System.out.println("Введите радиус круга:");
        double r = console.nextDouble();
        Сircle c=new Сircle(r);
        System.out.printf("Радиус круга: = %s%nПериметр круга: = %s%nПлощадь круга: = %s", r, c.getPerimeter(),c.getArea());
    }
}
