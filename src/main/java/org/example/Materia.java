package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;

public class Materia {
    private String nombre;
    private HashSet<Materia> materiasCorrelativas;

    public Materia(String nombre, HashSet<Materia> materiasCorrelativas) {
        this.nombre = nombre;
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public Boolean cumpleCorrelativas(HashSet<Materia> aprobadas){
        return aprobadas.containsAll(materiasCorrelativas);
    }
}
