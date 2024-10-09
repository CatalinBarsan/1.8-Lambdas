package org.example.exercise02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void printStringsWithOAndMoreThanFiveLetters() {
        List<String> strings = Arrays.asList("hello", "world", "java", "programming", "open", "code", "octopus");
        List<String> result = strings.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}

