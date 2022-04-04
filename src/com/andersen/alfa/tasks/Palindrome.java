//1.6 написать метод который определяет является ли строка палиндромом
package com.andersen.alfa.tasks;

import java.util.Scanner;

public class Palindrome {

    @SuppressWarnings("resources")
    public static boolean isPalindrome(String line) {

        String newLine = line.toLowerCase();
        char[] array = newLine.toCharArray();
        String reversedLine = "";

        for (int i = array.length-1; i >= 0; i--) {
            reversedLine += array[i];
        }
        return reversedLine.equals(newLine);
    }

    public static void main(String[] args) {

        String line;

        Scanner s =  new Scanner(System.in);
        System.out.println("Write the line:");
        line = s.nextLine();

        if (isPalindrome(line) == true) {
            System.out.println("Line is palindrome");
        } else {
            System.out.println("Line isn't palindrome");
        }
    }
}
