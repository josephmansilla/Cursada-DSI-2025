package ar.utn.ba.ddsi.diseflix.services.impl;

import ar.utn.ba.ddsi.diseflix.models.dtos.input.SerieInputDTO;
import ar.utn.ba.ddsi.diseflix.models.dtos.output.SerieOutputDTO;
import ar.utn.ba.ddsi.diseflix.models.entities.Serie;
import ar.utn.ba.ddsi.diseflix.repositories.IGenerosRepository;
import ar.utn.ba.ddsi.diseflix.repositories.ISeriesRepository;
import ar.utn.ba.ddsi.diseflix.services.ISeriesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeriesService implements ISeriesService {
  @Autowired
  private ISeriesRepository seriesRepository;
  @Autowired
  private IGenerosRepository generosRepository;

  private SerieOutputDTO serieOutputDTO(Serie serie){
    SerieOutputDTO dto = new SerieOutputDTO();
    dto.setId(serie.getID());
    dto.setNombre(serie.getNombre());
    dto.setResenia(serie.getResenia());
    dto.setCartelera(serie.getCartelera());
    dto.setHorasVisualizacion(serie.horasVisualizaciones());
    dto.setIdGenero(serie.getGenero().getID());

    return dto;
  }

  @Override
  public List<SerieOutputDTO> buscarTodas(){
    return this.seriesRepository
        .buscarTodas()
        .stream()
        .map(this::serieOutputDTO) // s-> serieOutputDTO(s)
        .toList();
  }
  @Override
  public SerieOutputDTO buscarPorID(Long ID){
    var serie = this.seriesRepository.buscarPorID(ID);
    if(serie == null){
      return null;
    }
    return this.serieOutputDTO(serie);
  }


  @Override
  public SerieOutputDTO crear(SerieInputDTO serieInputDTO) {
    var serie = new Serie();
    serie.setNombre(serie.getNombre());
    serie.setResenia(serie.getResenia());

    var genero = this.generosRepository.buscarPorID(serieInputDTO.getIdGenero());
    serie.setGenero(genero);
    this.seriesRepository.save(serie);

    return this.serieOutputDTO(serie);
  }
  @Override
  public void eliminar(Long id){
    var serie = this.seriesRepository.buscarPorID(id);
    if (serie != null) {
      this.seriesRepository.delete(serie);
    }
  }
}
