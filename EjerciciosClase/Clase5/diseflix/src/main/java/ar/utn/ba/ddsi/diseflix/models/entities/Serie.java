package ar.utn.ba.ddsi.diseflix.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Serie {
  private String nombre;
  private Long ID;
  private Genero genero;
  private String resenia;
  private Integer duracionEnMinutos;
  private String cartelera;
  private Integer cantidadDeReproducciones = 0;

  private void aumentarReproducciones(Integer reproducciones) {
    this.cantidadDeReproducciones += reproducciones;
  }
  public Double horasVisualizaciones(){
    return (this.duracionEnMinutos / 60.0) * this.cantidadDeReproducciones;
  }
}
