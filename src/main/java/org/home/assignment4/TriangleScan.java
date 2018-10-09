package org.home.assignment4;

import java.util.Scanner;

public class TriangleScan {


    public static void getParam() {
        Scanner console = new Scanner(System.in);
        System.out.println("Вы выбрали треугольник.");
        System.out.println("Введите длину стороны a:");
        double a = console.nextDouble();
        System.out.println("Введите длину стороны b:");
        double b = console.nextDouble();
        System.out.println("Введите длину стороны b:");
        double c = console.nextDouble();

        Triangle t = new Triangle(a, b, c);
        System.out.printf("Длина стороны a: = %s%nДлина стороны b: = %s%nДлина стороны c: = %s%nПериметр треугольника: = %s%nПлощадь треугольника: = %s", a,b,c, t.getPerimeter(), t.getArea());
    }
}
