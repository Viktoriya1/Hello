package org.lessons.lesson4;

//        Два способа создания массива
//        int [] anArrays=new int [4];
//        int [] anArray1={10,50,40,60,120};


//      int a=asArrays [5];  получить значения из массива с индексом 5 (6-й)
//      asArrays [10]=100;   положить значение с 10-м индексом значение в массив


import java.util.Arrays;

public class Array {


    public static void main(String[] args) {
//        int [] arr =new int [10];
//        for (int i=0; i<arr.length; i++)
//        {
//            System.out.println(arr[i]);
//
//        }
//        System.out.println(arr.length);
//
//
//        for (int el:arr){
//            System.out.println("index "+el);
//        }


        int[] arr = {10, 20, 30, 40, 50};

        int[] desc = new int[arr.length];

        System.out.println("arr.length =>" + arr.length);
        for (int i = 0; i < arr.length; i++) {
            desc[i] = arr[i];
        }
        System.out.println(Arrays.toString(desc));
        System.out.println(Arrays.equals(arr, desc));  //сравнить два массива


        StringBuilder sb = new StringBuilder();
        String str = sb.append("Tereschenko ")
                .append(' ')
                .append ("Viktoriya")
                .append(" ")
                .append("Dmitrievna")
                .toString();
        System.out.println(str);
    }


}
