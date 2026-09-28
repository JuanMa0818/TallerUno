package org.example;

public class Operaciones {
    public static <T extends Number> double sumar(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(sumar(3, 5));         // 8.0
        System.out.println(sumar(2.5, 1.5));     // 4.0
        System.out.println(sumar(10L, 20L));     // 30.0
    }
}