package ar.utn.ba.ddsi.diseflix.models.dtos.input;

import lombok.Data;

@Data
public class SerieInputDTO {
  private String nombre;
  private Long idGenero;
  private String resenia;
}
