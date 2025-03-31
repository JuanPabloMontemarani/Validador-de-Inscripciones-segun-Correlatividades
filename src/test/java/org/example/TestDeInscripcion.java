package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class TestDeInscripcion {
    @Test
    public void TestCumple(){
        HashSet<Materia> materias = new HashSet<>();
        Materia am1 = new Materia("Analisis1",materias);
        Materia aga = new Materia("Algebra",materias);


        HashSet<Materia> materiasCorrelativas = new HashSet<>();
        materiasCorrelativas.add(am1);
        materiasCorrelativas.add(aga);

        Materia am2 = new Materia("Analisis2",materiasCorrelativas);

        Alumno juanPablo = new Alumno("JuanPablo","Montemarani",materiasCorrelativas);

        HashSet<Materia> materiasACursar = new HashSet<>();
        materiasACursar.add(am2);

        Inscripcion primeraInscripcion = new Inscripcion(juanPablo,materiasACursar);
        Assertions.assertTrue(primeraInscripcion.aprobada());

    }
    @Test
    public void TestNoCumple(){
        HashSet<Materia> materias = new HashSet<>();
        Materia am1 = new Materia("Analisis1",materias);
        Materia aga = new Materia("Algebra",materias);
        Materia so = new Materia("SistemasOperativos",materias);


        HashSet<Materia> materiasCorrelativas = new HashSet<>();
        materiasCorrelativas.add(am1);
        materiasCorrelativas.add(aga);

        Materia am2 = new Materia("Analisis2",materiasCorrelativas);


        HashSet<Materia> materiasAprobadas = new HashSet<>();
        materiasAprobadas.add(so);

        Alumno juanPablo = new Alumno("JuanPablo","Montemarani",materiasAprobadas);

        HashSet<Materia> materiasACursar = new HashSet<>();
        materiasACursar.add(am2);

        Inscripcion primeraInscripcion = new Inscripcion(juanPablo,materiasACursar);
        Assertions.assertFalse(primeraInscripcion.aprobada());

    }
}
