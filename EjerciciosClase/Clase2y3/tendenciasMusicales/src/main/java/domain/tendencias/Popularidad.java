package domain.tendencias;

import domain.catalogo.Cancion;

public abstract class Popularidad {

    public abstract String leyenda(Cancion cancion);

    public abstract void reproducir(Cancion cancion);

    public abstract String icono();

    public String detalle(Cancion cancion) {
        return this.icono() + " - " + this.leyenda(cancion);
    }
    public void recibirDislike(){}
}
