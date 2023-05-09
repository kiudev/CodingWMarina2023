package UF4.HerenciaSimpleAct;

/**
 * Persona
 *
 * @author Daniel Saavedra Escuder
 * @version 17/04/2023
 */

public class Persona {
    private int id;
    private int edat;
    private String nom;
    private String cognom;
    private String adreca;

    public Persona() {
    }

    /**
     * Funció amb els atributs d'una persona
     * @param id ID
     * @param edat Edat
     * @param nom Nom
     * @param cognom Cognom
     * @param adreca Adreça
     */

    public Persona(int id, int edat, String nom, String cognom, String adreca) {
        this.id = id;
        this.edat = edat;
        this.nom = nom;
        this.cognom = cognom;
        this.adreca = adreca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }
}
