package com.mx_curso.unidad2.POO;

public class Alumno{
    private String matricula;
    private String nombre;

    public Alumno(){
        System.out.println("alumno creado");
    }
    public void curso(){
        System.out.println("el alumno se inscrito en el curso");
    }
    public void taller(){
        System.out.println("alumno inscrito al taller de base de datos");
    }
    public double pagomensualidad(){
        return 1500;
    }

    public int calcualrhorasdeestudio(int horas, int diasemana) {
        return horas*diasemana;
    }


}
