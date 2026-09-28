package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;

class Curso {
    String codigo;
    String nombre;
    int anio;

    Curso(String codigo, String nombre, int anio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " (" + anio + ")";
    }
}

public class CatalogoCursos {
    private ArrayList<Curso> cursos = new ArrayList<>();

    public void agregar(Curso c) {
        cursos.add(c);
    }

    public ArrayList<Curso> cursosDelAnio(int anioObjetivo) {
        ArrayList<Curso> resultado = new ArrayList<>();
        Iterator<Curso> it = cursos.iterator();

        while (it.hasNext()) {
            Curso actual = it.next();
            if (actual.anio == anioObjetivo) {
                resultado.add(actual);
            }
        }
        return resultado;
    }

    public void ordenarPorCodigo() {
        cursos.sort(Comparator.comparing(c -> c.codigo));
    }

    public static void main(String[] args) {
        CatalogoCursos catalogo = new CatalogoCursos();
        catalogo.agregar(new Curso("C103", "Bases de Datos", 2026));
        catalogo.agregar(new Curso("C101", "Cálculo I", 2025));
        catalogo.agregar(new Curso("C102", "Física I", 2026));

        System.out.println("Cursos de 2026: " + catalogo.cursosDelAnio(2026));

        catalogo.ordenarPorCodigo();
        System.out.println("Ordenado por código: " + catalogo.cursos);
    }
}