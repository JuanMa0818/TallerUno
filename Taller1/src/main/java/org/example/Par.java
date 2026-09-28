package org.example;

public class Par<T> {
    private T valor1;
    private T valor2;

    public Par(T valor1, T valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public boolean sonIguales() {
        return valor1.equals(valor2);
    }

    public static void main(String[] args) {
        Par<Integer> p1 = new Par<>(5, 5);
        System.out.println(p1.sonIguales()); // true

        Par<String> p2 = new Par<>("a", "b");
        System.out.println(p2.sonIguales()); // false
    }
}