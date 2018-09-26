package org.home.assignment1;

import java.util.Scanner;

//Задание 1.
//Написать программу решающую следующие уравнения. Переменные x,y,z,n инициализируется перед решением уравнения.
// Каждое решение оформить в отдельном статическом методе.
//x + (y - 100) * z / n  		=> считаем в long
//(x - (50 + y * z) * n) + x 	=> считаем в int
//x * (y / (z-1) + 555) - n 	=> считаем в float
//-x / y + z * (n+1) 		=> считаем в double


public class Equation {

    public static void eqtn1() {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter x,y,z and n:");
        long x = console.nextLong();
        long y = console.nextLong();
        long z = console.nextLong();
        long n = console.nextLong();
        long eq1 = (x + (y - 100) * z / n);
        System.out.printf("%nThe solution of the 1 Equation: %s", eq1);
    }

    public static void eqtn2() {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter x,y,z and n:");
        int x = console.nextInt();
        int y = console.nextInt();
        int z = console.nextInt();
        int n = console.nextInt();
        int eq2 = (x - (50 + y * z) * n) + x;
        System.out.printf("%nThe solution of the 2 Equation: %s", eq2);
    }

    public static void eqtn3() {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter x,y,z and n:");
        float x = console.nextFloat();
        float y = console.nextFloat();
        float z = console.nextFloat();
        float n = console.nextFloat();
        float eq3 = x * (y / (z - 1) + 555) - n;
        System.out.printf("%nThe solution of the 3 Equation: %s", eq3);
    }

    public static void eqtn4() {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter x,y,z and n:");
        double x = console.nextDouble();
        double y = console.nextDouble();
        double z = console.nextDouble();
        double n = console.nextDouble();
        double eq4 = -x / y + z * (n + 1);
        System.out.printf("%nThe solution of the 4 Equation: %s", eq4);
    }

    public static void main(String[] args) {
        eqtn1();
        eqtn2();
        eqtn3();
        eqtn4();
    }
}









