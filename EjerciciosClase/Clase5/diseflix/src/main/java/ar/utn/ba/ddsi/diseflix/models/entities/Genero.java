package ar.utn.ba.ddsi.diseflix.models.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Genero {
  private Long ID;
  private String nombre;

  public Genero(String nombre) {
    this.nombre = nombre;
  }

}
