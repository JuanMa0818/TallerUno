package org.example;

import java.util.Stack;

public class Navegador {
    public static void main(String[] args) {
        Stack<String> historial = new Stack<>();

        historial.push("google.com");
        historial.push("wikipedia.org");
        historial.push("github.com");

        System.out.println("Página actual: " + historial.peek());

        historial.pop(); // retrocede desde github
        System.out.println("Ahora en: " + historial.peek());

        historial.pop(); // retrocede desde wikipedia
        System.out.println("Ahora en: " + historial.peek());
    }
}