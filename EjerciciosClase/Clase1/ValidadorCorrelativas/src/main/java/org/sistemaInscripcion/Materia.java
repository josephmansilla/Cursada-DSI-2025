package org.sistemaInscripcion;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Getter
@Setter

public class Materia {
    private List<Materia> cursadasRequeridas;
    private List<Materia> AprobadasRequeridas;

    public Materia() {
        this.cursadasRequeridas = new ArrayList<Materia>();
        this.AprobadasRequeridas = new ArrayList<Materia>();
    }

    public void agregarCursadasRequeridas(Materia ... cursadas) {
        Collections.addAll(this.cursadasRequeridas, cursadas);
    }

    public void agregarAprobadasRequeridas(Materia ... aprobadas) {
        Collections.addAll(this.AprobadasRequeridas, aprobadas);
    }

    public boolean cumpleCursadas(Alumno alumno){
        return (boolean) this.cursadasRequeridas
                .stream()
                .allMatch(alumno::yaCurso);
    }
    public boolean cumpleAprobadas(Alumno alumno){
        return (boolean) this.AprobadasRequeridas
                .stream()
                .allMatch(alumno::yaAprobo);
    }

    public boolean puedeCursar(Alumno alumno){
        return cumpleCursadas(alumno) && cumpleAprobadas(alumno);
    }
}
