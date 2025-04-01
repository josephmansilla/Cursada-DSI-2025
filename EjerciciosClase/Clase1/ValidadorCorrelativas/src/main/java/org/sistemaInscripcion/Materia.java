package org.sistemaInscripcion;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.List;

@Getter
@Setter

public class Materia {
    private List<Materia> cursadasRequeridas;
    private List<Materia> AprobadasRequeridas;

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
