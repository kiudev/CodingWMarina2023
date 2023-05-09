package UF4.Empresa;

/**
 * Encarrec
 *
 * @author Daniel Saavedra Escuder
 * @version 06/04/2023
 */

public class Client {
    private String nom;
    private String adreca;
    private int telefon;
    private String email;

    String encarrec;

    /**
     * Funció per assignar un encàrrec al client
     * @param e Encàrrec
     */
    public void assignarEncarrec(String e) {
        encarrec = e;
    }

    /**
     * Funció per anul·lar un encàrrec al client
     * @param e Encàrrec
     */
    public void anulaEncarrec(String e) {
        encarrec = e;
    }
}
