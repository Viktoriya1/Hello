package org.home.assignment0;

import java.util.Scanner;

public class Velocity {

    public static void calcVelocity(double time, double range) {
        double rangeKmTom = range / 1000;
        double timeMToS = time * 60;
        double vel = rangeKmTom / timeMToS;
        System.out.println("Velocity  = " + vel + " m/s");
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter time(m): ");


        double time = console.nextDouble();
        System.out.println("Enter range (km): ");
        double range = console.nextDouble();
        calcVelocity(time, range);
    }
}




