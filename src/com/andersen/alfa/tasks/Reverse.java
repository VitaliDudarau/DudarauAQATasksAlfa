// Reverse the line
package com.andersen.alfa.tasks;

import java.util.Scanner;

public class Reverse {

    @SuppressWarnings("resources")
    public static String reverse(String line1) {

        char[] array = line1.toCharArray();
        String line2 = "";

        for (int i = array.length-1; i >= 0; i--) {
            line2 += array[i];
        }
        return line2;
    }

    public static void main(String[] args) {

        String line1;

        Scanner s =  new Scanner(System.in);
        System.out.println("Write the line:");
        line1 = s.nextLine();

        System.out.println("Reversed line is\n" + reverse(line1));
    }
}
