package com.mx_curso.unidad2.ordanamiento;

import java.util.Arrays;

public class insercion {
    public static void insertionSort(int[] arr) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

    public static void main(String[] args) {
        int[] datos = {70,33,80};

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(datos));

        insertionSort(datos);

        System.out.println("\nArreglo ordenado:");
        System.out.println(Arrays.toString(datos));
    }


}
