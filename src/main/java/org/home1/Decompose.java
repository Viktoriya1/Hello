package org.home1;


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
        String text = Integer.toString(number);
        int i = 4;
        int length = Integer.toString(number).length();
        while (i < length) {
            char num = text.charAt(i--);
            System.out.println(num);
        }

    }


    public static void main(String[] args) {
        dec(12929);
    }

}





