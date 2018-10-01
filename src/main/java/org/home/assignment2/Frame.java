package org.home.assignment2;
//Напишите программу, в которой задаются данные(строки): имя, фамилия и отчество и  выводящую эти  данные в следующем виде:
//********************************
//*	        Курс: Java core                *
//*		Студент	          *
//*		   ФИО		          *
//********************************
//Необходимо, чтобы программа сама определяла нужную длину рамки. Сама же длина рамки зависит от длины наибольшей строки внутри рамки. Используя циклы for легко можно выровнять стороны рамки.
//
//"Строка".length()
//Терещенко Виктория Дмитриена

import java.util.Scanner;
public class Frame {
    public static String curseLine = "Курс: Java core";
    public static String student = "Студент";
    public static String usersData = "";

    public static String space = " ";
    public static int maxLengh = 0;


    //Получаю ФИО
    public static void getUserData() {
        System.out.println("Пожалуйста, введите ФИО");
        usersData = new Scanner(System.in).nextLine();
    }

    //Проверяю что больше ФИО или curseLine (Курс: Java core)
    public static void findMaxLine() {

        maxLengh = (usersData.length() > curseLine.length()) ? usersData.length() : curseLine.length();
        maxLengh = maxLengh + 4;
    }

    //Напечатать строку со звездачками
    public static String getLineWithAsterisk() {

        String asterisks = "";
        for (int i = 0; i < maxLengh; i++) {
            asterisks += "*";
        }
        return asterisks;
    }

    public static String addStarsAndSpace(String str) {
        String spacesBef = "";
        String spacesAft = "";
        int countAfter = 0;
        int countBefore = (maxLengh - str.length()) / 2;
        String readyLine = "";

        if ((maxLengh - str.length()) % 2 > 0) {
            countAfter = countBefore + 1;
        } else {
            countAfter = countBefore;
        }
        for (int i = 1; i < countBefore; i++) {
            spacesBef = spacesBef + space;
        }
        for (int i = 1; i < countAfter; i++) {
            spacesAft = spacesAft + space;
        }
        String before = "*" + spacesBef;
        String after = spacesAft + "*";
        readyLine = before + str + after;
        return readyLine;
    }

    public static void main(String[] args) {
        getUserData();
        findMaxLine();
        String stars = getLineWithAsterisk();
        System.out.printf("%s%n%s%n%s%n%s%n%s%n", stars, addStarsAndSpace(curseLine), addStarsAndSpace(student), addStarsAndSpace(usersData), stars);
    }
}
