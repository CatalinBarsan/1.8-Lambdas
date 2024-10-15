package org.example.exercise08;

@FunctionalInterface
interface StringReverser {
    String reverse(String input);
}

public class Exercise8 {
    public static void reverseString(String in) {
        StringReverser reverser = input -> new StringBuilder(input).reverse().toString();
        String reversed = reverser.reverse(in);
        System.out.println(reversed);
    }
}


