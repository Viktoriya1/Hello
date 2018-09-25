package org.home1;

//Задание 2.
//Составить программу, которая будет разлаживать 5-ти значное число на отдельные цифры данного числа, справа-налево. Число задается в параметре статического метода.
//Каждую цифру вывести в отдельной строке.
//45685
//5
//8
//6
//5
//4


public class Decompose {


    public static void dec( int number) {

        while ( number > 0) {
            System.out.println(number%10);
            number = number / 10;
        }

    }

    public static void main(String[] args) {
        dec(45685);
    }

}






