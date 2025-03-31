package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class TestDeMateria{

        @Test
        public void TestCumple() {
            HashSet<Materia> materias = new HashSet<>();
            Materia am1 = new Materia("Analisis1",materias);
            Materia aga = new Materia("Algebra",materias);


            HashSet<Materia> materiasCorrelativas = new HashSet<>();
            materiasCorrelativas.add(am1);
            materiasCorrelativas.add(aga);

            Materia am2 = new Materia("Analisis2",materiasCorrelativas);


            assertTrue(am2.cumpleCorrelativas(materiasCorrelativas));
        }




    @Test
        public void TestNoCumple() {
        HashSet<Materia> materias = new HashSet<>();
        Materia am1 = new Materia("Analisis1",materias);
        Materia aga = new Materia("Algebra",materias);
        Materia so = new Materia("SistemasOperativos",materias);

        HashSet<Materia> materiasCorrelativas = new HashSet<>();
        materiasCorrelativas.add(am1);
        materiasCorrelativas.add(aga);
        materiasCorrelativas.add(so);

        HashSet<Materia> materiasAprobadas = new HashSet<>();
        materiasCorrelativas.add(so);

        Materia am2 = new Materia("Analisis2",materiasCorrelativas);


        assertFalse(am2.cumpleCorrelativas(materiasAprobadas));
        }
}
