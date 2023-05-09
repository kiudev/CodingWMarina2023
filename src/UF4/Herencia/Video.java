package UF4.Herencia;

/**
 * Video
 *
 * @author Daniel Saavedra Escuder
 */

public class Video extends Media {

    private String director;
    private String idioma;

    public Video() {

    }

    /**
     * Constructor
     * @param director
     * @param idioma
     */

    public Video(String director, String idioma) {
        this.director = director;
        this.idioma = idioma;
    }

    /**
     * Getter
     * @return director
     */

    public String getDirector() {
        return director;
    }

    /**
     * Setter
     * @param director
     */

    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Getter
     * @return idioma
     */

    public String getIdioma() {
        return idioma;
    }

    /**
     * Setter
     * @param idioma
     */

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

}
