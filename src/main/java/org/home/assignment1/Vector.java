package org.home.assignment1;
import java.util.Scanner;


//Задание 3.
//Напишите программу, которая для 3-х координат вектора x, y, и z, с основанием у начала координат вычисляет длину этого вектора и выведите её на консоль. Вывод программы у вас должен быть похож на этот:
//
//Длина вектора (X, Y, Z) = 8.66025
//
//Вместо X, Y, Z должны быть подставлены координаты.
//
//Math.sqrt(a);
//



public class Vector {

    public static void vectorLength(double x, double y, double z) {
        double vector = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
        String a = "Hi Vikki";
        System.out.printf("Length of Vector = %s %s", Math.sqrt(vector), a);
    }

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter x,y and z:");
        double x = console.nextDouble();
        double y = console.nextDouble();
        double z = console.nextDouble();
        vectorLength(x, y, z);
    }
}


