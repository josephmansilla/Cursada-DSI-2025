package ar.utn.ba.ddsi.diseflix.services.impl;

import ar.utn.ba.ddsi.diseflix.models.entities.Genero;
import ar.utn.ba.ddsi.diseflix.models.dtos.output.GeneroOutputDTO;
import ar.utn.ba.ddsi.diseflix.repositories.IGenerosRepository;
import ar.utn.ba.ddsi.diseflix.services.IGenerosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerosService implements IGenerosService {

  @Autowired
  private IGenerosRepository generosRepository;

  @Override
  public List<GeneroOutputDTO> buscarTodas(){
    return this.generosRepository
        .buscarTodas()
        .stream()
        .map(this::generoOutputDTO)
        .toList();
  }

  private GeneroOutputDTO generoOutputDTO(Genero genero) {
    var dto = new GeneroOutputDTO();
    dto.setId(genero.getID());
    dto.setNombre(genero.getNombre());
    return dto;
  }
}

