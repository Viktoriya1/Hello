package org.home.assignment2;


//Дано целочисленно число N > 1. Выведите фразу “Число N является степенью двойки!”,
// если число N является точной степенью двойки,
// или фразу “Число N НЕ является степенью двойки!” в противном случае.
//Операцией возведения в степень пользоваться нельзя!
//Задачу решить с помощью рекурсии.


public class Recursion {

    public static String str1 = "Число является степенью двойки!";
    public static String str2 = "Число N НЕ является степенью двойки!";

    public static void check(int n) {
        if (n > 1) {
            if (n % 2 == 0) {
                if (n / 2 == 1) {
                    System.out.println(str1);
                } else {
                    check(n / 2);
                }
            } else System.out.println(str2);
        } else {
            System.out.println("Вы ввели неверное число");
        }
    }


    public static void main(String[] args) {
        check(100);
        check(256);
        check(-10);
        check(0);
        check(16);


    }

}
