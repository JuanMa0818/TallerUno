package org.example;

import java.util.TreeSet;
import java.util.Comparator;

public class Busqueda {
    public static void main(String[] args) {
        TreeSet<String[]> productos = new TreeSet<>(Comparator.comparing(p -> p[0]));

        productos.add(new String[]{"102", "Teclado"});
        productos.add(new String[]{"101", "Mouse"});
        productos.add(new String[]{"103", "Monitor"});

        // mostrar ordenado por código
        for (String[] p : productos) {
            System.out.println(p[0] + " - " + p[1]);
        }

        // buscar por código
        String codigoBuscado = "102";
        for (String[] p : productos) {
            if (p[0].equals(codigoBuscado)) {
                System.out.println("Encontrado: " + p[1]);
            }
        }
    }
}