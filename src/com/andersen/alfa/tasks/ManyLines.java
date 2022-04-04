// 1.5 вывести строку указанное число раз с разделителем
package com.andersen.alfa.tasks;

import java.util.Scanner;

public class ManyLines {

    @SuppressWarnings("resources")
    public static void write(String line, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(line + "\n");
            }
    }

    public static void main(String[] args) {

        String line;
        int count;

        Scanner s =  new Scanner(System.in);
        System.out.println("Write the line:");
        line = s.nextLine();
        System.out.println("Write a number of lines:");
        count = s.nextInt();

        System.out.println(count + " lines are\n");
        write(line, count);
    }
}
