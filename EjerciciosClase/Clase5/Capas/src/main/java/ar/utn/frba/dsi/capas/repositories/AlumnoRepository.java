package ar.utn.frba.dsi.capas.repositories;

import ar.utn.frba.dsi.capas.domain.Alumno;
import java.util.List;
import lombok.Builder;

@Builder
public class AlumnoRepository {

  private List<Alumno> alumnos;

  public Integer buscar(Integer legajo){
    return this.alumnos.stream().findFirst(legajo) || null;
  }
  public void agregar(Alumno alumno){
    this.alumnos.add(alumno);
  }
}
