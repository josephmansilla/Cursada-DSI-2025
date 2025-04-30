package ar.utn.ba.ddsi.diseflix.controllers;


import ar.utn.ba.ddsi.diseflix.models.dtos.output.GeneroOutputDTO;
import ar.utn.ba.ddsi.diseflix.services.IGenerosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/generos")
@CrossOrigin(origins = "http://localhost:3000")
public class GenerosController{

  @Autowired
  private IGenerosService generosService;

  @GetMapping
  public List<GeneroOutputDTO> buscarTodas(){
    return this.generosService.buscarTodas();
  }
}
