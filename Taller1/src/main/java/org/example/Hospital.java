package org.example;

import java.util.PriorityQueue;
import java.util.Comparator;

public class Hospital {
    public static void main(String[] args) {
        PriorityQueue<int[]> cola = new PriorityQueue<>(
                Comparator.comparingInt((int[] p) -> p[1]).reversed()
        );
        // cada paciente: {id, prioridad}

        cola.add(new int[]{1, 2}); // Ana, prioridad 2
        cola.add(new int[]{2, 5}); // Luis, prioridad 5
        cola.add(new int[]{3, 3}); // Marta, prioridad 3

        while (!cola.isEmpty()) {
            int[] paciente = cola.poll();
            System.out.println("Paciente " + paciente[0] + " - prioridad " + paciente[1]);
        }
    }
}