/*
Создать коллекцию целых чисел, написать методы:
2.2. Который четные числа умножает на 100, а от
 нечетных отнимает 100 и возвращает коллекцию.
 Количество принимаемых и возвращаемых элементов
 коллекций должно совпадать
 */
package com.andersen.alfa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOddNumbers {

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(25, 54, 56, -54, 5, -8);

        List<Integer> newArray = array.stream()
                .map(x -> x % 2 == 0 ? x * 100: x - 100)
                .collect(Collectors.toList());

        newArray.forEach(System.out::println);
    }
}
