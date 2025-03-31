package org.example;

import java.util.HashSet;

public class Inscripcion {
    private Alumno alumno;
    private HashSet<Materia> materiasACursar;


    public Inscripcion(Alumno alumno, HashSet<Materia> materiasACursar) {
        this.alumno = alumno;
        this.materiasACursar = materiasACursar;
    }

    public boolean aprobada() {
        return materiasACursar
                .stream()
                .allMatch(materia -> alumno.puedeCursar(materia));
    }
}

