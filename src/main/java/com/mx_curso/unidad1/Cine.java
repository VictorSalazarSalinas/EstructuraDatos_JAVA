package com.mx_curso.unidad1;

import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        int[][] cine={
                {1,1,0,0,0},
                {0,0,0,1,0},
                {1,0,1,0,0},
                {0,0,0,0,1}
        };
        Scanner sc = new Scanner(System.in);

        //Mostrar mapa
        System.out.println("Mapa de Asientos (0=Libre,1=Ocupado):");
        for (int i=0;i<cine.length;i++) {
            for (int j=0;j<cine[i].length;j++) {
                System.out.print(cine[i][j]+" ");
            }
            System.out.println();
        }

        //Solicitar asiento
        System.out.print("Elige la fila (0-3): ");
        int fila=sc.nextInt();
        System.out.print("Elige el asiento (0-4): ");
        int asiento=sc.nextInt();

        if (cine[fila][asiento]==0) {
            cine[fila][asiento]=1;
            System.out.println("reservado");
        } else {
            System.out.println("ocupado");
        }

        //mapa actualizado
        for (int i=0;i<cine.length;i++) {
            for (int j=0; j<cine[i].length;j++) {
                System.out.print(cine[i][j]+" ");
            }
            System.out.println();
        }

        //Contar asientos
        int libres=0;
        for (int i=0;i<cine.length;i++) {
            for (int j=0;j<cine[i].length;j++) {
                if (cine[i][j]==0) libres++;
            }
        }
        System.out.println("Asientos libres: "+libres);
    }
}
