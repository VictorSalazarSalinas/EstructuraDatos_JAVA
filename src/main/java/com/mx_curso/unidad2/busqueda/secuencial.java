package com.mx_curso.unidad2.busqueda;

public class secuencial {
    public static int busquedasecuencial(int[]arr , int a) {
          int n=arr.length;
          for(int i=0;i<n;i++){
              if(arr[i]==a){
                  return 1;
              }
          }
        return -1;

    }
    public static void main(String[] args){
        int [] datos = {1,10};
        int elemnto=1;
        int indice = busquedasecuencial(datos,elemnto);
        if(indice==1){
            System.out.println("encontrado");
        }
        else {
            System.out.println("no encontrado");
        }

    }
}
