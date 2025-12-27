package com.mx_curso.unidad2.ordanamiento;
public class burbuja {
    public static void main(String[] args) {
        int[] numeros = {15,4,1,10};

        bubbleSort(numeros);

        System.out.print("Lista ordenada: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar los elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}


