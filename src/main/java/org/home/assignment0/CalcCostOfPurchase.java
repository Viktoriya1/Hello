package org.home.assignment0;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class CalcCostOfPurchase {

    public static void calcCostOfPurchase(double costOfCandies, double costOfCookies) {
        double onePurchase = costOfCandies * 0.3 + costOfCookies * 0.4;
        double threePurchases = (costOfCandies * 1.8 + costOfCookies * 2) * 3;
        System.out.println("I am friendly, so cost of 1 purchase = " + onePurchase + " grn");
        System.out.println("I am friendly, so cost of 3 purchases = " + threePurchases + " grn");

    }


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter cost of candies(kg): ");
        double costOfCandies = console.nextDouble();
        System.out.println("Enter cost of cooclies (kg): ");
        double costOfCookies = console.nextDouble();
        calcCostOfPurchase(costOfCandies, costOfCookies);
    }
}
