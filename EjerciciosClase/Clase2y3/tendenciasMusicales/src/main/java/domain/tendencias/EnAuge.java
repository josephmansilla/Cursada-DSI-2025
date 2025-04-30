package domain.tendencias;

import domain.catalogo.Cancion;
import domain.helpers.Icono;

public class EnAuge extends Popularidad{

    private static Integer cantLikesMinParaPasarATendencia = 20000;
    private Integer cantRepro = 0;

    @Override
    public void reproducir(Cancion cancion){
        this.cantRepro++;
        if(this.cantRepro >= cantLikesMinParaPasarATendencia
            && cancion.getCantLikes() > cantLikesMinParaPasarATendencia){
            cancion.setPopularidad(new EnTendencia());
        }
    }
    @Override
    public String icono(){
        return Icono.ROCKET.texto();
    }

    @Override
    public String leyenda(Cancion cancion) {
        return cancion.getAlbum().getArtista().getNombre() + " - ";
    }

}
