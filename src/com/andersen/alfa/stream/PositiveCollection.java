/*
Создать коллекцию целых чисел, написать методы:
2.1. Который отрицательные числа делает положительными
и возвращает коллекцию ([1, 5, -3, 7] -> [1, 5, 3, 7])
 */
package com.andersen.alfa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveCollection {

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(25, 54, 56, -54, 5, -8);

        List<Integer> newArray = array.stream()
                .map(Math::abs)
                .collect(Collectors.toList());

        newArray.forEach(System.out::println);
    }
}
