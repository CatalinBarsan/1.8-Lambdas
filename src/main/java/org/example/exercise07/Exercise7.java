package org.example.exercise07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void sortStringsByLengthDescending() {
        List<Object> mixedList = Arrays.asList("apple", "banana", "pear", 1, "kiwi", "mango", 2);

        List<String> sortedStrings = mixedList.stream()
                .filter(obj -> obj instanceof String)
                .map(String.class::cast)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());

        System.out.println(sortedStrings);
    }
}

