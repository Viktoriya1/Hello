package org.home.assignment4;

import java.util.Scanner;

public class SquareScan {


    public static void getParam() {
        Scanner console = new Scanner(System.in);
        System.out.println("Вы выбрали квадрат.");
        System.out.println("Введите длину стороны:");
        double side = console.nextDouble();
        Square s=new Square(side);
        System.out.printf("Длина стороны: = %s%nПериметр квадрата: = %s%nПлощадь квадрата: = %s", side, s.getPerimeter(),s.getArea());
    }
}
