package org.example;

import java.util.*;

public class Listas {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> treeMap = new TreeMap<>();

        hashMap.put("103", "Monitor");
        hashMap.put("101", "Mouse");
        hashMap.put("102", "Teclado");

        linkedHashMap.put("103", "Monitor");
        linkedHashMap.put("101", "Mouse");
        linkedHashMap.put("102", "Teclado");

        treeMap.put("103", "Monitor");
        treeMap.put("101", "Mouse");
        treeMap.put("102", "Teclado");

        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("TreeMap: " + treeMap);
    }
}