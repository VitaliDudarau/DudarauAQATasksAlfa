package com.andersen.alfa.tasks;

import java.util.Scanner;

public class ReplaceSymbols {

    @SuppressWarnings("resources")
    public static String replace(String line1, String oldSymbol, String newSymbol) {
        char[] array = line1.toCharArray();
        char[] oldChar = oldSymbol.toCharArray();
        char[] newChar = newSymbol.toCharArray();

        String line2 = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldChar[0]) {
                line2 += newChar[0];
            } else {
                line2 += array[i];
            }
        }
        return line2;
    }

    public static void main(String[] args) {
        String line1;
        String oldSymbol;
        String newSymbol;

        Scanner s =  new Scanner(System.in);
        System.out.println("Write the line:");
        line1 = s.nextLine();
        System.out.println("Write the one old symbol:");
        oldSymbol = s.nextLine();
        System.out.println("Write the one new symbol:");
        newSymbol = s.nextLine();

        System.out.println("Replaced line is\n" + replace(line1, oldSymbol, newSymbol));
    }
}