package domain.tendeciasMusicales;

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
    public static Integer cantReproMinimaParaEstarEnAuge = 0;
    public static Integer cantReproMinimaParaPasarATendencia ;
    public static Integer cantLikesMinimaParaPasarATendencia ;

    public static void setCantReproMinimaParaEstarEnAuge(Integer valor) {
        cantReproMinimaParaEstarEnAuge = valor;
    }

    public Cancion(String nombre, Album album, Integer anioLanzamieto) {
        this.cantReproducciones = 0;
        this.cantDisLikes = 0;
        this.cantLikes = 0;
        this.album = album;
        this.anioLanzamieto = anioLanzamieto;
        this.cantReproducciones++;
        this.Popularidad = Popularidad.NORMAL;
    } //no debo sobrecargar todos los atributos, solamente lo necesario.

    public String serEscuchada(){
        this.cantReproducciones++;
        this.ultReproduccion = LocalDateTime.now();

        String descripcion = "";

        switch (this.popularidad) {
            case NORMAL: {
                descripcion = Icono.MUSICAL_NOTE.texto() + " - " + this.getAlbum().getArtista().getNombre() + " - " this.nombre;
                if(this.cantReproducciones > cantReproMinimaParaEstarEnAuge) {

                }
            }
            case EN_AUGE: {
                descripcion = Icono.ROCKET.texto() + " - " + this.getAlbum().getArtista().getNombre() + " - ";
                if()
                break;}
            case EN_TENDENCIA: descripcion = Icono.FIRE.texto() + " - " + this.nombre; break;
        }
        //TODO: resolver el detalle completo en base a la popularidad de la cancion
        return "Detalle Completo";
    }
}
