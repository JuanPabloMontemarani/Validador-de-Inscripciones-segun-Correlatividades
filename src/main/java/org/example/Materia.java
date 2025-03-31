package org.example;

import java.util.HashSet;

public class Materia {
    private String nombre;
    private HashSet<Materia> materiasCorrelativas;

    public Materia(String nombre, HashSet<Materia> materiasCorrelativas) {
        this.nombre = nombre;
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public boolean cumpleCorrelativas(HashSet<Materia> aprobadas){
        return aprobadas.containsAll(materiasCorrelativas);
    }
}
