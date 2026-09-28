package org.example;

public class NumeroMayor {
    public static <T extends Comparable<T>> T mayor(T a, T b) {
        return (a.compareTo(b) >= 0) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(mayor(7, 3));           // 7
        System.out.println(mayor("pera", "manzana")); // pera
        System.out.println(mayor(2.1, 5.9));        // 5.9
    }
}