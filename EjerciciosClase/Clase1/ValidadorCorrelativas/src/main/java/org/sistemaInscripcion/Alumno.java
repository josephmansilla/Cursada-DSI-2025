package org.sistemaInscripcion;

import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Setter

public class Alumno {
    private String nombreCompleto;
    private Integer legajo;
    private List<Materia> materiasCursadas;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombreCompleto, Integer legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.materiasCursadas = new ArrayList<Materia>();
        this.materiasAprobadas = new ArrayList<Materia>();
    }

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
