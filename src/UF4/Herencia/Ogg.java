package UF4.Herencia;

/**
 * Ogg
 *
 * @author Daniel Saavedra Escuder
 */

public class Ogg extends Musica {

    private int versio;

    public Ogg() {

    }

    /**
     * Constructor
     * @param versio
     */

    public Ogg(int versio) {
        this.versio = versio;
    }

    /**
     * Getter
     * @return versio
     */

    public int getVersio() {
        return versio;
    }

    /**
     * Setter
     * @param versio
     */

    public void setVersio(int versio) {
        this.versio = versio;
    }

}
