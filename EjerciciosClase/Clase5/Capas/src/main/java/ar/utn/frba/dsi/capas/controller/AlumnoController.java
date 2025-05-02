package ar.utn.frba.dsi.capas.controller;

import static com.sun.tools.javac.jvm.ByteCodes.error;

import ar.utn.frba.dsi.capas.services.AlumnoService;
import lombok.Builder;

@Builder
public class AlumnoController {


  private void registrarCalificacion(Json r, Json w){
    private legajo = w.params;

    private Integer obtenerPromedioDeAlumno(Json r, Json w){
      try{
        Integer promedio = this.alumnoService.obtenerPromedioDeAlumno(legajo);
      } catch (error){
        return res.status(404).json(error.message());
      }
    }
  }

  private Router configurarRutas(){
    Router router = express.Router();

    router.post("/alumnoId/calificaciones", this.registrarCalificacion(this));
    router.get("/alumnoId/promedio", this.obtenerPromedio(this));

    return router;
  }
  private static void crearAlumnoController(AlumnoService alumnoService){
    AlumnoController alumnoController = new AlumnoController(alumnoService);
    reutnr alumnoController.configurarRutas();
  }

}
