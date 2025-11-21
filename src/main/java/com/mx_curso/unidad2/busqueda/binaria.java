package com.mx_curso.unidad2.busqueda;

import com.mx_curso.unidad2.ordanamiento.burbuja;

public class binaria {
    public static int busqueda(int [] a, int b){
        int inicio = 0;
        int fin = a.length-1;
        while(inicio<=fin){
            int medio = (inicio+fin)/2;
            if(a[medio]==b){
                return medio;
            }
            if(a[medio]<b){
                inicio = medio+1;

            }else {
                fin = medio-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] datos = {1,10};
        int elemnto=1;

        burbuja.bubbleSort(datos);
        int indice = busqueda(datos,elemnto);
        if(indice==1){
            System.out.println("encontrado");
        }
        else {
            System.out.println("no encontrado");
        }

    }
}
