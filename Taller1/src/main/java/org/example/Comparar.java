package org.example;

public class Comparar {
    public static <T extends Runnable & Comparable<T>> int ejecutarYComparar(T obj, T otro) {
        obj.run();                  // primero se ejecuta
        return obj.compareTo(otro); // luego se compara
    }

    public static void main(String[] args) {
        class Tarea implements Runnable, Comparable<Tarea> {
            int prioridad;

            Tarea(int prioridad) {
                this.prioridad = prioridad;
            }

            public void run() {
                System.out.println("Ejecutando tarea con prioridad: " + prioridad);
            }

            public int compareTo(Tarea otra) {
                return Integer.compare(this.prioridad, otra.prioridad);
            }
        }

        Tarea t1 = new Tarea(5);
        Tarea t2 = new Tarea(3);

        int resultado = ejecutarYComparar(t1, t2);
        System.out.println("Resultado de comparación: " + resultado);
    }
}