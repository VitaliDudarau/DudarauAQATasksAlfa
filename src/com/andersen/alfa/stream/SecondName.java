/*
2.3. Есть стринговый лист фамилий, нужно
пройтись по списку, вытащить фамилии
которые начинаются на А и поместить
их в другой список для дальнейшей
работы с ними
 */
package com.andersen.alfa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondName {

    public static void main(String[] args) {

        List<String> array = Arrays.asList("Терешков", "Иванов", "Антонов", "Киреев", "Авдеев", "Аверин");

        List<String> newArray = array.stream()
                .filter(s -> s.startsWith("А"))
                .collect(Collectors.toList());

        newArray.forEach(System.out::println);
    }
}
