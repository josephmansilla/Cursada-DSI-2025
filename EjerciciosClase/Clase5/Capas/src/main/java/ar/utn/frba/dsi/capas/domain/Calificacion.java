package ar.utn.frba.dsi.capas.domain;

import java.time.LocalDate;

public class Calificacion {

  public Integer idCalificacion;
  public String nombreMateria;
  public Integer nota;
  private LocalDate fecha;

  private void verificarCalificacion(Integer nota){
    if (nota < 0 || nota > 10) {
      throw new IllegalArgumentException("La nota debe estar entre 0 y 10");
    }
  }

  public Calificacion(Integer id, String nombreMateria, Integer nota, LocalDate fecha) {
    this.idCalificacion = id;
    this.nombreCalificacion = nombreMateria;
    this.verificarCalificacion(nota);
    this.nota = nota;
    this.fecha = fecha;
  }

  public void setNota(Integer nuevaNota){
    this.verificarCalificacion(nuevaNota);
    this.nota = nuevaNota;
  }

}
