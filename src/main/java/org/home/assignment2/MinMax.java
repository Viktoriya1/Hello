package org.home.assignment2;


//Есть целое положительное число (long). Программа должна определить наименьшую и наибольшую цифры, которые входят в состав данного числа.
//
//        У числа 15875:
//        Наименьшее число: 1
//        Наибольшее число: 8

import java.util.Scanner;

public class MinMax {
    public static long data;
    public static long min = 9;
    public static long max = 0;

    public static void getNumber() {
        System.out.println("Please, enter number:");
        data = new Scanner(System.in).nextLong();
    }

    public static void divide() {
        while (data > 0) {
            long current = data % 10;
            if (current > max) {
                max = current;
            }
            if (current < min){
                min = current;
            }
            data = data / 10;
        }
    }

    public static void main(String[] args) {
        getNumber();
        divide();
        System.out.printf("The min value is : %s%nThe max value is : %s%n", min,max);


    }

}

