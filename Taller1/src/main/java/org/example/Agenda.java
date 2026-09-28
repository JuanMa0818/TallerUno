package org.example;

import java.util.TreeMap;

public class Agenda {
    public static void main(String[] args) {
        TreeMap<String, String> eventos = new TreeMap<>();

        eventos.put("2026-10-15", "Examen de Cálculo");
        eventos.put("2026-09-30", "Entrega de proyecto");
        eventos.put("2026-11-01", "Reunión de grupo");

        System.out.println("Eventos en orden cronológico:");
        for (String fecha : eventos.keySet()) {
            System.out.println(fecha + " -> " + eventos.get(fecha));
        }
    }
}