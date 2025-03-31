package org.example;

import java.util.HashSet;

public class Alumno {
    private String nombre;
    private String apellido;
    private HashSet<Materia> aprobadas;

    public Alumno(String nombre, String apellido, HashSet<Materia> aprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.aprobadas = aprobadas;
    }

    public boolean puedeCursar(Materia materia){
        return materia.cumpleCorrelativas(aprobadas);
    }
}
