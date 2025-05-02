package ar.utn.frba.dsi.capas.services;

import ar.utn.frba.dsi.capas.domain.Alumno;
import ar.utn.frba.dsi.capas.domain.Calificacion;
import ar.utn.frba.dsi.capas.domain.Materia;
import ar.utn.frba.dsi.capas.repositories.AlumnoRepository;
import ar.utn.frba.dsi.capas.repositories.MateriaRepository;
import java.time.LocalDate;

public class AlumnoService {

  private AlumnoRepository alumnosRepositorio;
  private MateriaRepository materiasRepositorio;

  public AlumnoService(AlumnoRepository alumnos, MateriaRepository materias) {
    this.alumnosRepositorio = alumnos;
    this.materiasRepositorio = materias;
  }
  // Registrar una calificación de un alumno
  public void registrarAlumno(Integer legajo, Integer idMateria, Integer nota, LocalDate fecha){
    Alumno alumno = this.alumnosRepositorio.buscar(legajo);
    if(alumno == null){ throw new RuntimeException("No existe un alumno"); }

    Materia materia = this.materiasRepositorio.buscarPorId(idMateria);
    if(materia == null){ throw new RuntimeException("No existe una materia"); }

    Calificacion calificacion = new Calificacion(crypto.randomUUID(), materia, nota, fecha || newDate());

  }

  // Visualizar el promedio general de un Alumno
  public Integer obtenerPromedioDeAlumno(Integer legajo){
    Alumno alumno = this.alumnosRepositorio.buscar(legajo);
    if(alumno == null){ throw new RuntimeException("No existe un alumno"); }
    return alumno.promedioGeneral();
  }
}
