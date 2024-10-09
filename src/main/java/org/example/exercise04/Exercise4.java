package org.example.exercise04;

import java.util.Arrays;
import java.util.List;

public class Exercise4 {
    public static void printMonthsWithMethodReference() {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        months.forEach(System.out::println);
    }
}
