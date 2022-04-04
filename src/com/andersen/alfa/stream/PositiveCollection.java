/*
Создать коллекцию целых чисел, написать методы:
2.1. Который отрицательные числа делает положительными
и возвращает коллекцию ([1, 5, -3, 7] -> [1, 5, 3, 7])
 */
package com.andersen.alfa.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PositiveCollection {

    public static void main(String[] args) {

        List<Integer> array = IntStream.of(25, 54, 56, -54, 5, -8).map(Math::abs).boxed().collect(Collectors.toList());

        for (Integer i : array) {
            System.out.println(i);
        };
    }
}
