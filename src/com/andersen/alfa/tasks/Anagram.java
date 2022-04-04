/* 1.7 написать метод который определяет
является ли слово анаграммой
(например рано - нора)
 */
package com.andersen.alfa.tasks;

import java.util.Scanner;

public class Anagram {

    @SuppressWarnings("resources")

    public static char[] sort(char[] arrayChar) {

        char temp = 0;

        for (int i = 0; i < arrayChar.length; i++) {
            for (int j = i+1; j < arrayChar.length; j++) {
                if (arrayChar[i] > arrayChar[j]) {
                    temp = arrayChar[j];
                    arrayChar[j] = arrayChar[i];
                    arrayChar[i] = temp;
                }
            }
        }
        return arrayChar;
    }

    public static boolean isAnagram(String line1, String line2) {

        boolean equal = true;

        if (line1.length() != line2.length()) {
            equal = false;
        } else {
            String newLine1 = line1.toLowerCase();
            String newLine2 = line2.toLowerCase();
            char[] array1 = newLine1.toCharArray();
            char[] array2 = newLine2.toCharArray();
            char[] sortedChar1 = sort(array1);
            char[] sortedChar2 = sort(array2);

            for (int i = 0; i < sortedChar1.length; i++) {
                if (sortedChar1[i] != sortedChar2[i]) {
                    equal = false;
                    break;
                }
            }
        }
        return equal;
    }

    public static void main(String[] args) {

        String line1;
        String line2;

        Scanner s =  new Scanner(System.in);
        System.out.println("Write the line1:");
        line1 = s.nextLine();
        System.out.println("Write the line2 with the same numbers of symbols of line1:");
        line2 = s.nextLine();

        if (isAnagram(line1, line2) == true) {
            System.out.println("Line is anagram");
        } else {
            System.out.println("Line isn't anagram");
        }
    }
}
