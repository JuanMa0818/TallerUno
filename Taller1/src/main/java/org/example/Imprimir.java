package org.example;

public class Imprimir {
    public static <T> void imprimir(T valor) {
        System.out.println(valor);
    }

    public static void main(String[] args) {
        imprimir(42);
        imprimir("Hola mundo");
        imprimir(3.14);

    }
}