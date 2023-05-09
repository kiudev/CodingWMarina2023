package UF4.Herencia;

/**
 * MP3
 *
 * @author Daniel Saavedra Escuder
 */

public class MP3 extends Musica {

    private int mode;

    public MP3() {

    }

    /**
     * Constructor
     * @param mode
     */

    public MP3(int mode) {
        this.mode = mode;
    }

    /**
     * Getter
     * @return mode
     */

    public int getMode() {
        return mode;
    }

    /**
     * Setter
     * @param mode
     */

    public void setMode(int mode) {
        this.mode = mode;
    }

}
