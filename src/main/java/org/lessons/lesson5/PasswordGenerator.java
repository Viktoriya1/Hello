package org.lessons.lesson5;

import java.util.Random;

public class PasswordGenerator {

    static Random rd = new Random();
    static String validDigits = "1234567890";   //1-3 chars
    static String validSpecChar = "!@#$%^&*";   //1 char
    static String validChars = "ABCDabcd";      //любые два подряд
    static final int specCharGroup = 0;
    static final int digitsGroup = 1;
    static final int charsGroup = 2;


    public static void generateRandomValue(int num) {
    }

    public static char generateRandomChar(String array) {
        int randomIndex = rd.nextInt(array.length());
        return array.charAt(randomIndex);
    }

    public static String generatePassword(int size) {
        boolean specCharFlag = false;
        int digitsCounter = 0;
        StringBuilder pass = new StringBuilder();
        char randomChar = '0';
        while (size != pass.length()) {
            int randomGroup = rd.nextInt(3);
            switch (randomGroup) {
                case digitsGroup:
                    if (digitsCounter <= 3) {
                        randomChar = generateRandomChar(validDigits);
                        digitsCounter++;
                        break;
                    }
                case specCharGroup:
                    if (!specCharFlag) {
                        randomChar = generateRandomChar(validSpecChar);
                        specCharFlag = true;
                    }
                    break;
                case charsGroup:
                    randomChar = generateRandomChar(validChars);
                    break;
            }
            if ((pass.length() == 0) || (pass.charAt(pass.length() - 1) != randomChar)) {
                pass.append(randomChar);
            }
        }
        return pass.toString();
    }


    public static void main(String[] args) {
        System.out.println(generatePassword(10));
    }
}
