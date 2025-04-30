package domain.tendencias;

import domain.catalogo.Cancion;
import domain.helpers.Icono;
import lombok.Setter;
@Setter
public class Normal extends Popularidad {
    public static Integer cantRepoMinParaPasarAEnAuge = 1000;
    private Integer cantRepro = 0;

    @Override
    public void reproducir(Cancion cancion) {
        this.cantRepro++;
        if(this.cantRepro > cantRepoMinParaPasarAEnAuge){
            cancion.setPopularidad(new EnAuge());
        }
    }

    @Override
    public String icono(){ return Icono.MUSICAL_NOTE.texto(); }

    @Override
    public String leyenda(Cancion cancion) {
        return cancion.getAlbum().getArtista().getNombre() + " - "
                + cancion.getAlbum().getNombre() + " - "
                + cancion.getNombre();
    }
}
