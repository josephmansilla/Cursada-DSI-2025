package domain.tendencias;

import domain.catalogo.Cancion;
import domain.helpers.Icono;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EnTendencia extends Popularidad {

    private Integer cantHsSinEscucharParaBajarPopularidad = 24;
    @Override
    public void reproducir(Cancion cancion) {
        if(this.hanPasadoMasDe(cantHsSinEscucharParaBajarPopularidad, cancion.getUltReproduccion())){
            cancion.setPopularidad(new Normal());
        }
    }
    private Boolean hanPasadoMasDe(Integer horas, LocalDateTime fechaInicial){
        return ChronoUnit.HOURS.between(fechaInicial, LocalDateTime.now()) >= horas;
    }
    @Override
    public String icono() {
        return Icono.FIRE.texto();
    }
    @Override
    public String leyenda(Cancion cancion) {
        return Icono.ROCKET.texto() + " - " + getAlbum().getArtista().getNombre() + " - ";
    }
}
