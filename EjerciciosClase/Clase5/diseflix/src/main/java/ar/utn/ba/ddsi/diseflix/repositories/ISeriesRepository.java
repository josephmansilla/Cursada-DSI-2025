package ar.utn.ba.ddsi.diseflix.repositories;

import ar.utn.ba.ddsi.diseflix.models.entities.Serie;
import java.util.List;

public interface ISeriesRepository {

  public Serie buscarPorID(Long ID);
  public List<Serie> buscarTodas();
  public void save(Serie serie);
  public void delete(Serie serie);
}
