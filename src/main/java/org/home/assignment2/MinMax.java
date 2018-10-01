package org.home.assignment2;



//Есть целое положительное число (long). Программа должна определить наименьшую и наибольшую цифры, которые входят в состав данного числа.
//
//        У числа 15875:
//        Наименьшее число: 1
//        Наибольшее число: 8

public class MinMax {



    public static void task3() {







        


        int[] array = new int[]{200, 10, 11, 99, 11};
        int min = array[0];

        for(int i = 0; i < array.length; ++i) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);






    }




    public static void main(String[] args) {


        task3();











    }
}
