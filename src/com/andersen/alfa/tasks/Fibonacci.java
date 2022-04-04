// 1.8 вычислить число Фибоначчи
package com.andersen.alfa.tasks;

import java.util.Scanner;

public class Fibonacci {

    @SuppressWarnings("resources")
    public static long[] fibonacci(int number) {
        
        long[] array = new long[number];
        array[0] = 0;
        array[1] = 1;
        
        for (int i = 2; i < number; i++) {
            array[i] = array[i-2] + array[i-1];
        }
        return array;
    }

    public static void main(String[] args) {

        int number;

        Scanner s =  new Scanner(System.in);
        System.out.println("Write a number of Fibonacci sequence no more 93:");
        number = s.nextInt();

        long array[] = fibonacci(number);
        System.out.println("Fibonacci sequnce is");
        for (int i = 0; i < array.length; i++) {
            System.out.println("\n" + (i+1) + ": " + array[i]);
        }
    }
}
