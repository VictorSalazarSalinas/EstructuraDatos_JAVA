package com.mx_curso.unidad1;

public class RobotSensores {
    public static void main(String[] args) {
        int[] lecturas={120,85,210,150};
        int umbral=100;

        for (int i=0;i<lecturas.length;i++) {
            System.out.println("Sensor "+(i+1)+":"+lecturas[i]+" cm");
            if (lecturas[i] < umbral) {
                System.out.println("Advertencia");
            }
        }
    }
}
