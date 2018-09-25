package org.home1;
import java.util.Scanner;

//Задание 1.
//Написать программу решающую следующие уравнения. Переменные x,y,z,n инициализируется перед решением уравнения.
// Каждое решение оформить в отдельном статическом методе.
//x + (y - 100) * z / n  		=> считаем в long
//(x - (50 + y * z) * n) + x 	=> считаем в int
//x * (y / (z-1) + 555) - n 	=> считаем в float
//-x / y + z * (n+1) 		=> считаем в double


public class Equation {

    public static void eqtn1(int x, int y, int z,int n) {
        long eq1 = (long) ((x + (y - 100) * z / n));
        System.out.printf("%nThe solution of the 1 Equation: %s", eq1);
    }


    public static void eqtn2(int x, int y, int z,int n) {
        int eq2 = (x - (50 + y * z) * n) + x;
        System.out.printf("%nThe solution of the 2 Equation: %s", eq2);

    }

    public static void eqtn3(int x, int y, int z,int n) {
        float eq3 = (float)(x * (y / (z-1) + 555) - n);
        System.out.printf("%nThe solution of the 3 Equation: %s", eq3);
    }


    public static void eqtn4(int x, int y, int z,int n) {
        double eq4 = (double)(-x / y + z * (n+1));
        System.out.printf("%nThe solution of the 4 Equation: %s", eq4);
    }


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter x,y,z and n:");
        int x = console.nextInt();
        int y = console.nextInt();
        int z = console.nextInt();
        int n = console.nextInt();
//        int f = console.nextDouble();


        eqtn1(x,y,z,n);
        eqtn2(x,y,z,n);
        eqtn3(x,y,z,n);
        eqtn4(x,y,z,n);


    }




}









