package com.or;

import java.util.Scanner;

public class Main {

    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter an array length: ");
        int [] arr = new int[SCANNER.nextInt()];

        System.out.println("These enter the array values: ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = SCANNER.nextInt();
        }

        System.out.println(digitsArr(arr));

    }
    public static String digitsArr(int [] arr){

        int tempNumber = 0;
        for (int i = 0; i < arr.length ; i++) {
            tempNumber = arr[i];
            System.out.print(tempNumber);
        }
        return "";
    }
}



