package UF4.Empresa;

/**
 * Sucursal
 *
 * @author Daniel Saavedra Escuder
 * @version 06/04/2023
 */

public class Sucursal {
    private String nom;
    private String adreca;
    private String telefon;
    private String email;

    String transportista;
    String client;
    String encarrec;

    /**
     * Funció per quan descansa el transportista
     * @param t Transportista
     */
    public void descansa(String t) {
        transportista = t;
    }

    /**
     * Funció per quan treballa el transportista
     * @param t Transportista
     */
    public void treballa(String t) {
        transportista = t;
    }

    /**
     * Funció per l'alta d'un client
     * @param c Client
     */
    public void altaClient(String c) {
        client = c;
    }

    /**
     * Funció per la baixa d'un client
     * @param c Client
     */
    public void baixaClient(String c) {
        client = c;
    }

    /**
     * Funció per l'alta d'un encàrrec
     * @param c Client
     * @param t Transportista
     * @param e Encàrrec
     */
    public void altaEncarrec(String c, String t, String e) {
        client = c;
        transportista = t;
        encarrec = e;
    }

    /**
     * Funció per la baixa d'un encàrrec
     * @param e Encàrrec
     */
    public void anulaEncarrec(String e) {
        encarrec = e;
    }
}
