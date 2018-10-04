package org.home.assignment3;
//Задача 1.
//Программа запрашивает строку пользователя,которую она должна преобразовать согласно меню выбора:
//СТРОКА ЗАГЛАВНЫМИ БУКВАМИ
//строка в нижнем регистре
//С Заглавной Буквы (Первый Символ Каждого Слова В Строке )
//пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ
//Как в предложении(с заглавной буквы).
//выход из программы
//Если ввели любой другой символ (не A,B,C,D,E,F) - программа должна вывести текст об ошибке и заново предложить выбрать вариант
//
//То есть после ввода строки программа отображает меню, представленное выше, через которое можно удобно выбирать любое действие.
// Выбор действия возможен как с заглавной так и с прописной буквы.
//Каждое действие над исходной строкой оформить в виде отдельного статического метода.
//Для выбора варианта использовать оператор switch.
//
//“”.split(“ “);

import java.util.Scanner;

public class Task1 {

    public static String enteredData = "";
    public static String variant = "";

    public static void getUserData() {
        System.out.println("Пожалуйста, введите строку");
        enteredData = new Scanner(System.in).nextLine();
    }

    public static void displayMenu() {
        System.out.println("Выберите дейтсвие со строкой:");
        System.out.println("A. СТРОКА ЗАГЛАВНЫМИ БУКВАМИ");
        System.out.println("B. строка в нижнем регистре");
        System.out.println("C. С Заглавной Буквы (Первый Символ Каждого Слова В Строке )");
        System.out.println("D. пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ");
        System.out.println("E. Как в предложении(с заглавной буквы).");
        System.out.println("F. выход из программы");
        variant = new Scanner(System.in).nextLine();
    }

    public static String doUpper() {
        return enteredData.toUpperCase();
    }

    public static String doLower() {
        return enteredData.toLowerCase();
    }

    public static String doEveryFirstUpper() {
        String newStr = "";
        String[] splitedEnteredData = enteredData.split(" ");
        for (String word : splitedEnteredData) {
            word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            newStr += word + " ";
        }
        return newStr.trim();
    }

    public static String doEveryFirstLower() {
        String newStr = "";
        String[] splitedEnteredData = enteredData.split(" ");
        for (String word : splitedEnteredData) {
            word = word.substring(0, 1).toLowerCase() + word.substring(1).toUpperCase();
            newStr += word + " ";
        }
        return newStr.trim();
    }

    public static String doLikeInSentence() {
        String newStr = enteredData.substring(0, 1).toUpperCase() + enteredData.substring(1).toLowerCase();
        return newStr.trim();
    }

    public static void whatWillWeDo() {
        displayMenu();
            switch (variant) {
                case "A":
                    System.out.println(doUpper());
                    break;
                case "B":
                    System.out.println(doLower());
                    break;
                case "C":
                    System.out.println(doEveryFirstUpper());
                    break;
                case "D":
                    System.out.println(doLikeInSentence());
                    break;
                case "E":
                    System.out.println(doEveryFirstLower());
                    break;
                case "F":
                    System.out.println("Bye!!!");
                    break;
                default:
                    System.out.println("WRONG!!!");
                    whatWillWeDo();
        }
    }

    public static void main(String[] args) {
        getUserData();
        whatWillWeDo();
    }
}




//
//        if (variant.toLowerCase()=="a" && variant.toLowerCase() != "b" && variant.toLowerCase() != "c" && variant.toLowerCase() != "d" && variant.toLowerCase() != "e" && variant.toLowerCase() != "f") {
//            displayMenu();
//        } else {
