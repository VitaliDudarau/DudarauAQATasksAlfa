// 1.3 удалить определенный символ в строке
package com.andersen.alfa.tasks;

import java.util.Scanner;

public class DeleteSymbols {

    @SuppressWarnings("resources")
    public static String delete(String line1, String deleteSymbol) {

        char[] array = line1.toCharArray();
        char[] deleteChar = deleteSymbol.toCharArray();

        String line2 = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != deleteChar[0]) {
                line2 += array[i];
            }
        }
        return line2;
    }

    public static void main(String[] args) {

        String line1;
        String deleteSymbol;

        Scanner s =  new Scanner(System.in);
        System.out.println("Write the line:");
        line1 = s.nextLine();
        System.out.println("Write the one deleted symbol:");
        deleteSymbol = s.nextLine();

        System.out.println("New line is\n" + delete(line1, deleteSymbol));
    }
}
