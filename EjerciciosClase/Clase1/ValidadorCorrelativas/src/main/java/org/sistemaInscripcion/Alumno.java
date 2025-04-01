package org.sistemaInscripcion;

import lombok.Setter;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Setter

public class Alumno {
    private String nombreCompleto;
    private Integer legajo;
    private Set<Materia> materiasCursadas;
    private Set<Materia> materiasAprobadas;

    public boolean yaCurso(Materia materia){
        return materiasCursadas.contains(materia);
    }
    public boolean yaAprobo(Materia materia){
        return materiasAprobadas.contains(materia);
    }

    public void agregarMateriasCursadas(Materia ... materias){
        Collections.addAll(this.materiasCursadas, materias);
    }
    public void agregarMateriasAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }
}
