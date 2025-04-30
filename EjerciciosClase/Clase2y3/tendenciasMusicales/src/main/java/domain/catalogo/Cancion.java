package domain.catalogo;

import domain.tendencias.Normal;
import domain.tendencias.Popularidad;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class Cancion {
    private String nombre;
    private Album album;
    private Integer cantLikes;
    private Integer cantDisLikes;
    private Integer anioLanzamieto;
    private Integer cantReproducciones;
    private LocalDateTime ultReproduccion;
    private Popularidad popularidad;
    private Integer cantReproduccionesEnPopuActual;
    public Artista artista;


    public Cancion(String nombre, Album album, Integer anioLanzamieto) {
        this.cantReproducciones = 0;
        this.cantDisLikes = 0;
        this.cantLikes = 0;
        this.album = album;
        this.anioLanzamieto = anioLanzamieto;
        this.popularidad = new Normal();
    } //no debo sobrecargar todos los atributos, solamente lo necesario.

    public String serEscuchada(){
        this.cantReproducciones++;
        this.popularidad.reproducir(this);
        String descripcion = this.popularidad.detalle(this);
        this.ultReproduccion = LocalDateTime.now();
        return descripcion;
    }
}
