package ar.utn.ba.ddsi.diseflix.models.dtos.output;

import lombok.Data;

@Data
public class SerieOutputDTO {
  private Long id;
  private String nombre;
  private String resenia;
  private Double horasVisualizacion;
  private String cartelera;
  private Long idGenero;
}
