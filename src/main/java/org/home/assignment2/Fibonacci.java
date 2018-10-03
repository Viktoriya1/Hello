package org.home.assignment2;
//Реализовать рекурсивный статический метод для расчета числа в ряду фибоначчи по указанному индексу.

public class Fibonacci {


    public static int fib(int n) throws Exception {
        if (n >= 0) {
            if (n == 0) {
                return  0;

            }
            if (n == 1) {
                return  1;

            } else {
                return  fib(n - 1) + fib(n - 2);
            }
        } else {
            throw new Exception("Вы ввели неверный индекс, индекс должен быть больше 0 ");
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println(fib(4));
    }

}


