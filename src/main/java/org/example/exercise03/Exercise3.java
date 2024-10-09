package org.example.exercise03;

import java.util.Arrays;
import java.util.List;

public class Exercise3 {
    public static void printMonths() {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        months.forEach(month -> System.out.println(month));
    }
}

