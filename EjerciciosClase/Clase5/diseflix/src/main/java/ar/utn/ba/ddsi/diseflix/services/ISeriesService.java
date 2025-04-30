package ar.utn.ba.ddsi.diseflix.services;

import ar.utn.ba.ddsi.diseflix.models.dtos.input.SerieInputDTO;
import ar.utn.ba.ddsi.diseflix.models.dtos.output.SerieOutputDTO;
import java.util.List;

public interface ISeriesService {
  List<SerieOutputDTO> buscarTodas();
  SerieOutputDTO buscarPorID(Long id);
  SerieOutputDTO crear(SerieInputDTO serieInputDTO);
  void eliminar (Long id);

}
