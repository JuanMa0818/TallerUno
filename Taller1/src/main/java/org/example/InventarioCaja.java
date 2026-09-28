package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class InventarioCaja<T extends Comparable<T>> {
    private ArrayList<T> elementos = new ArrayList<>();

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public ArrayList<T> mayoresQue(T umbral) {
        ArrayList<T> resultado = new ArrayList<>();
        Iterator<T> it = elementos.iterator();

        while (it.hasNext()) {
            T actual = it.next();
            if (actual.compareTo(umbral) > 0) {
                resultado.add(actual);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        InventarioCaja<Integer> caja = new InventarioCaja<>();
        caja.agregar(10);
        caja.agregar(25);
        caja.agregar(5);
        caja.agregar(30);

        ArrayList<Integer> mayores = caja.mayoresQue(15);
        System.out.println("Mayores que 15: " + mayores); // [25, 30]
    }
}