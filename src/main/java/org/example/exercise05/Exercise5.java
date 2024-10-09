package org.example.exercise05;

interface PiValueProvider {
    double getPiValue();
}
public class Exercise5 {
    public static void getPiValue() {
        PiValueProvider piProvider = () -> 3.1415;
        System.out.println(piProvider.getPiValue());
    }
}
