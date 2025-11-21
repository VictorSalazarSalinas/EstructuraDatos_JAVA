package com.mx_curso.unidad2.POO;

public class universidad {
    public static void main(String[] args){
        Alumno alumno=new Alumno();
        alumno.curso();
        alumno.taller();
        System.out.println("mensualidad"+alumno.pagomensualidad());
        System.out.println("horas de estudio " + alumno.calcualrhorasdeestudio( 1,5));



        Alumno alumno2=new Alumno();
        alumno2.curso();
        alumno2.pagomensualidad();
        alumno2.taller();
        System.out.println("horas de estudio " + alumno.calcualrhorasdeestudio(1,5 ));


        Docente docente = new Docente();
        docente.Asig();

    }

}
