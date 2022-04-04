// 1.9 вычислить факториал
package com.andersen.alfa.tasks;

import java.util.Scanner;

public class Factorial {

    @SuppressWarnings("resources")
    public static long factorial(int number) {

        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {

        int number;

        Scanner s =  new Scanner(System.in);
        System.out.println("Write a number for calculating a factorial no more 20:");
        number = s.nextInt();

        System.out.println("Factorial of number " + number + " is " + factorial(number));
    }
}
