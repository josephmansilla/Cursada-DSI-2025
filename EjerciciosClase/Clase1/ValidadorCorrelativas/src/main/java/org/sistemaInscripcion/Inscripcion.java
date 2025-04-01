package org.sistemaInscripcion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasInscriptas;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasInscriptas = new ArrayList<>();
    }

    public boolean aprobada(){
        return (boolean) materiasInscriptas
                .stream()
                .allMatch(materia -> materia.puedeCursar(this.alumno));
    }

    public void agregarMateriasALaInscripcion(Materia ... materiasCursadas){
        Collections.addAll(this.materiasInscriptas, materiasCursadas);
    }
}
