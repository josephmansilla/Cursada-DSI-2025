package ar.utn.ba.ddsi.diseflix.repositories.impl;

import ar.utn.ba.ddsi.diseflix.models.entities.Genero;
import ar.utn.ba.ddsi.diseflix.repositories.IGenerosRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class GenerosRepository implements IGenerosRepository {
  private List<Genero> generos;
  public GenerosRepository() {
    this.generos = new ArrayList<>();
  }

  @Override
  public List<Genero> buscarTodas() {
    return this.generos;
  }
  @Override
  public Genero buscarPorID(Long id) {
    return this.generos
        .stream()
        .filter(genero -> genero.getID().equals(id)).findFirst().orElse(null);
  }
  @Override
  public void save(Genero genero) {
    genero.setID((long) this.generos.size());
    this.generos.add(genero);
  }
  @Override
  public void delete(Genero genero) {
    this.generos.remove(genero);
  }
}
