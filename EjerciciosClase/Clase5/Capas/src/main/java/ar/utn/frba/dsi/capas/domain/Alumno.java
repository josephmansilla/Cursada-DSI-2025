package ar.utn.frba.dsi.capas.domain;

import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Alumno {
  private String nombre;
  private String apellido;
  private Integer legajo;
  private List<Calificacion> calificaciones;

  public void agregarCalificacion(List<Calificacion> calificaciones){
    this.calificaciones.addAll(calificaciones);
  }

  public List<Calificacion> calificacionesDeMateria(Materia materia){
    return this.calificaciones.stream().filter(
        (Calificacion c) -> c.idCalificacion == materia.idMateria
    ).build();
  }

  public Integer promedioGeneral(){
    if(this.calificaciones.isEmpty()){return 0;}
    Integer suma = this.calificaciones.stream().mapToInt(( c) -> c.nota).sum();
    return suma / this.calificaciones.size();
  }
}
