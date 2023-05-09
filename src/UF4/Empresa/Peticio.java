package UF4.Empresa;

/**
 * Peticio
 *
 * @author Daniel Saavedra Escuder
 * @version 06/04/2023
 */

public class Peticio {
    private int quantitat;

    String tipus_producte;

    /**
     * Funció per assignar un producte
     * @param p TipusProducte
     */
    public void assignarProducte(String p) {
        tipus_producte = p;
    }
}
