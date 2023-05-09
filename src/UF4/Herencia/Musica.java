package UF4.Herencia;

/**
 * Musica
 *
 * @author Daniel Saavedra Escuder
 */

public class Musica extends Media {

    private String artista;
    private String estil;

    public Musica() {

    }

    /**
     * Constructor
     * @param artista
     * @param estil
     */

    public Musica(String artista, String estil) {
        this.artista = artista;
        this.estil = estil;
    }

    /**
     * Getter
     * @return artista
     */

    public String getArtista() {
        return artista;
    }

    /**
     * Setter
     * @param artista
     */

    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * Getter
     * @return estil
     */

    public String getEstil() {
        return estil;
    }

    /**
     * Setter
     * @param estil
     */

    public void setEstil(String estil) {
        this.estil = estil;
    }

}
