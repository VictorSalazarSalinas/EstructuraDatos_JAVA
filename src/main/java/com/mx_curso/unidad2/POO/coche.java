package com.mx_curso.unidad2.POO;

public class coche {

        private String nombre;
        private int velocidad;

        public coche(){
            System.out.println("coche creado");
        }
        public void reparar(){
            System.out.println("el coche esta reparado");
        }

        public int calcualdistancia(int velocidad, int tiempo) {
            return velocidad*tiempo;
        }
}
