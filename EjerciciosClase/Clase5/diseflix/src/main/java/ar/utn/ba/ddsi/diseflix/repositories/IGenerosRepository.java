package ar.utn.ba.ddsi.diseflix.repositories;

import ar.utn.ba.ddsi.diseflix.models.entities.Genero;
import java.util.List;


public interface IGenerosRepository {
  public List<Genero> buscarTodas();
  public Genero buscarPorID(Long id);
  public void save(Genero genero);
  public void delete(Genero genero);
}
