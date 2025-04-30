package ar.utn.ba.ddsi.diseflix.services;

import ar.utn.ba.ddsi.diseflix.models.dtos.output.GeneroOutputDTO;
import java.util.List;

public interface IGenerosService {
  List<GeneroOutputDTO> buscarTodas();
}
