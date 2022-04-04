package com.andersen.alfa.tasks;

import java.util.Scanner;

public class CountSymbols {

    @SuppressWarnings("resources")
    public static int count(String line, String countedSymbol) {

        String newline = line.toLowerCase();
        String newCountedSymbol = countedSymbol.toLowerCase();
        char[] array = newline.toCharArray();
        char[] countedChar = newCountedSymbol.toCharArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == countedChar[0]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String line;
        String countedSymbol;

        Scanner s =  new Scanner(System.in);
        System.out.println("Write the line:");
        line = s.nextLine();
        System.out.println("Write the one counted symbol:");
        countedSymbol = s.nextLine();

        System.out.println("Line contains " + count(line, countedSymbol) + " symbols " + countedSymbol);
    }
}
