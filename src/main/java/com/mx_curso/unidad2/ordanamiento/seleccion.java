package com.mx_curso.unidad2.ordanamiento;

import java.util.Arrays;

public class seleccion {

    public static void main(String[] args) {
        // Lista con las puntuaciones de importancia
        int[] importancias = {3,2,1,1};
        System.out.println("Características no ordenadas:");
        System.out.println(Arrays.toString(importancias));
        int n = importancias.length;

        // Algoritmo de selección para ordenar de menor a mayor
        for (int i = 0; i < n; i++) {
            int minimo = i;
            for (int j = i + 1; j < n; j++) {
                if (importancias[j] < importancias[minimo]) {
                    minimo = j;
                }
            }
            // Intercambiar
            int temp = importancias[i];
            importancias[i] = importancias[minimo];
            importancias[minimo] = temp;
        }

        System.out.println("Características ordenadas por importancia (menor a mayor):");
        System.out.println(Arrays.toString(importancias));
    }
}
