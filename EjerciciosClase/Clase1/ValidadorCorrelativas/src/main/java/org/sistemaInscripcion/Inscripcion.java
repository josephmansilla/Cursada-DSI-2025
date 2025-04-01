package org.sistemaInscripcion;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Inscripcion {
    private Alumno alumno;
    private Set<Materia> materiasInscriptas;

    public Inscripcion(Set<Materia> materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
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
