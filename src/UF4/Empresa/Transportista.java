package UF4.Empresa;

/**
 * Transportista
 *
 * @author Daniel Saavedra Escuder
 * @version 06/04/2023
 */

public class Transportista {
    private String nom;
    private int telefon;
    private int numLlicencia;

    String encarrec;

    /**
     * Funció per assignar un encàrrec al transportista
     * @param e Encàrrec
     */
    public void assignarEncarrec(String e) {
        encarrec = e;
    }

    /**
     * Funció per eliminar un encàrrec al transportista
     * @param e Encàrrec
     */
    public void anulaEncarrec(String e) {
        encarrec = e;
    }
}
