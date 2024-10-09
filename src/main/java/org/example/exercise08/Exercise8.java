package org.example.exercise08;

@FunctionalInterface
interface StringReverser {
    String reverse(String input);
}

public class Exercise8 {
    public static void reverseString() {
        StringReverser reverser = input -> new StringBuilder(input).reverse().toString();
        String original = "hello";
        String reversed = reverser.reverse(original);
        System.out.println(reversed);
    }
}
