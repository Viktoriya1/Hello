package org.home.assignment3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задача 2.
//Пользователь вводит строку. Подсчитать количество повторений символов, во введенной строке.
//Вводимая строка должна состоять из символов только латинского алфавита.
//Вывести на экран(построчно) кол-во повторений каждого символа входной строки.

public class Task2 {

    public static String usersData = "helllllllooooo";

    public static void getData() {
        System.out.println("Пожалуйста, введите строку");
        usersData = new Scanner(System.in).nextLine();
    }

    public static void isValid() {
        Pattern p = Pattern.compile("^[a-zA-Z]{0,100}$");
        Matcher m = p.matcher(usersData);
        if (m.matches() == true) {
            char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            for (char c : alphabet) {
                int counter = 0;
                for (int i = 0; i < usersData.length(); i++) {
                    if (usersData.charAt(i) == c) {
                        counter++;
                    }
                }
                if (counter > 0) {
                    System.out.println("Количество повторений \"" + c + "\" символа входной строки = " + counter);
                }
            }

        } else {
            System.out.println("falsefalse");
        }
    }

    public static void main(String[] args) {
        getData();
        isValid();
    }
}
