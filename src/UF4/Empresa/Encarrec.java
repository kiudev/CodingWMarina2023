package UF4.Empresa;

/**
 * Encarrec
 *
 * @author Daniel Saavedra Escuder
 * @version 06/04/2023
 */

public class Encarrec {
    private int dia;
    private int mes;
    private int hora;
    private int minuts;

    String peticio;

    /**
     * Funció per afegir un producte al encàrrec
     * @param p Petició
     */
    public void afegirProducte(String p) {
        peticio = p;
    }

    /**
     * Funció per eliminar un producte al encàrrec
     * @param p Petició
     */
    public void eliminarProducte(String p) {
        peticio = p;
    }
}
