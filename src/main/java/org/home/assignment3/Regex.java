package org.home.assignment3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задача 3.
//Программа запрашивает у пользователя ФИО, мобильный телефон и email, и проверяет данные на валидность с помощью регулярных выражений.
//ФИО - только буквы английского  алфавита, дефис и пробел
//Мобильный телефон - +380 далее 2 цифры кода (украина) и 7 любых цифр
//email - любые латинские символы, цифры, дефис и нижний прочерк, обязательный символ @ и .
//Проверить все вводимые данные и вывести неверно введенные.
public class Regex {



    public static String regexForUsersName="^[a-zA-Z\\s\\-]{2,100}$";
    public static String regexForPhoneNumber="^\\+380[95|97|66|93|63|73|67|50]\\d{8}$";
    public static String regexForEmail="^[A-Za-z0-9_-]+\\@\\w+\\.(com|ru)$";



    public static String getUserName() {
        Scanner console = new Scanner(System.in);
        System.out.println("Пожалуйста, введите ФИО");
        String usersName = console.nextLine();
        return usersName;
    }



    public static String getPhoneNumber() {
        Scanner console = new Scanner(System.in);
        System.out.println("Пожалуйста, введите мобильный телефон");
        String phoneNumber = console.nextLine();
        return phoneNumber;
    }


    public static String getEmail() {
        Scanner console = new Scanner(System.in);
        System.out.println("Пожалуйста, введите email");
        String email = console.nextLine();
        return email;
    }


    public static void validate(String str,String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        if (m.matches() == false) {
            System.out.println(str + " введен(ы) неверно");
        }

    }

    public static void main(String[] args) {

        String userName=getUserName();
        String phoneNumber=getPhoneNumber();
        String email=getEmail();

        validate(userName,regexForUsersName);
        validate(phoneNumber,regexForPhoneNumber);
        validate(email,regexForEmail);

    }

}
