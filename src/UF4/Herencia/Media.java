package UF4.Herencia;

/**
 * Media
 *
 * @author Daniel Saavedra Escuder
 */

public class Media {

    private String nom;
    private int durada;

    public Media() {

    }

    /**
     * Constructor
     * @param nom
     * @param durada
     */

    public Media(String nom, int durada) {
        this.nom = nom;
        this.durada = durada;
    }

    /**
     * Getter
     * @return nom
     */

    public String getNom() {
        return nom;
    }

    /**
     * Setter
     * @param nom
     */

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter
     * @return durada
     */

    public int getDurada() {
        return durada;
    }

    /**
     * Setter
     * @param durada
     */

    public void setDurada(int durada) {
        this.durada = durada;
    }

}
