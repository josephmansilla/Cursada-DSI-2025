package org.sistemaInscripcion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AlumnoTest {
    Materia SyPN = new Materia();
    Materia LyED = new Materia();
    Materia AyED = new Materia();
    Materia ASI = new Materia();
    Materia PdeP = new Materia();
    Materia IT1 = new Materia();
    Materia DSI = new Materia();
    Materia IA = new Materia();
    Alumno alumno = new Alumno("Joseph Mansilla", 11111);

    @Test
    @DisplayName("Joseph ya cursó Sistemas y Procesos de Negocios")
    public void cursoSyPN(){
        alumno.agregarMateriasCursadas(SyPN);
        assertTrue(alumno.yaCurso(SyPN));
    }
    @Test
    @DisplayName("Joseph NO  cursó Inteligencia Artificial")
    public void cursoIA(){
        assertFalse(alumno.yaCurso(IA));
    }


    @Test
    @DisplayName("Joseph aprobó Paradigmas de Programación")
    public void aproboPdeP(){
        alumno.agregarMateriasAprobadas(PdeP);
        assertTrue(alumno.yaAprobo(PdeP));
    }
    @Test
    @DisplayName("Joseph NO aprobó Diseño de Sistemas de Información")
    public void aproboDSI(){
        assertFalse(alumno.yaAprobo(DSI));
    }

    @Test
    @DisplayName("A Joseph le aceptan la inscripción de Logica")
    public void cursaraLogica() {
        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateriasALaInscripcion(LyED);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("A Joseph le aceptan la inscripción a Diseño de Sistemas")
    public void verificarInscripcionAProbada() {
        DSI.agregarCursadasRequeridas(PdeP, ASI);
        DSI.agregarAprobadasRequeridas(AyED, SyPN, IT1);

        alumno.agregarMateriasCursadas(PdeP, ASI);
        alumno.agregarMateriasAprobadas(AyED, SyPN, IT1);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateriasALaInscripcion(DSI);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("A Joseph NO le aceptan la inscripción a Diseño de Sistemas")
    public void verificarInscripcionRechazada() {

        DSI.agregarCursadasRequeridas(PdeP, ASI);
        DSI.agregarAprobadasRequeridas(AyED, SyPN, IT1);

        alumno.agregarMateriasCursadas(PdeP, ASI);
        alumno.agregarMateriasAprobadas(AyED, SyPN);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateriasALaInscripcion(DSI);

        Assertions.assertFalse(inscripcion.aprobada());
    }

}