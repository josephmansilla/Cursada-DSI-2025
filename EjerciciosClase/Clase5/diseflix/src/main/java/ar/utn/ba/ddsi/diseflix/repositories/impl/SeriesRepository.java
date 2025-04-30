package ar.utn.ba.ddsi.diseflix.repositories.impl;

import ar.utn.ba.ddsi.diseflix.models.entities.Serie;
import ar.utn.ba.ddsi.diseflix.repositories.ISeriesRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class SeriesRepository implements ISeriesRepository {
  private List<Serie> series;

  public SeriesRepository() {
    this.series = new ArrayList<>();
  }

  @Override
  public Serie buscarPorID(Long id){
    return this.series
        .stream()
        .filter(s -> s.getID() == id)
        .findFirst()
        .orElse(null);
  }

  @Override
  public List<Serie> buscarTodas(){
    return this.series;
  }
  @Override
  public void save(Serie serie){
    serie.setID((long) this.series.size());
    this.series.add(serie);
  }
  @Override
  public void delete(Serie serie){
    this.series.remove(serie);
  }
}
