package org.example.exercise01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void printStringsWithO() {
        List<String> strings = Arrays.asList("hello", "world", "java", "programming", "open", "code");
        List<String> result = strings.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}

