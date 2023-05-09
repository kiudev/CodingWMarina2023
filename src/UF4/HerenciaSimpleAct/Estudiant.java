package UF4.HerenciaSimpleAct;

import UF4.Persona.Persona;

/**
 * Estudiant
 *
 * @author Daniel Saavedra Escuder
 * @version 17/04/2023
 */

public class Estudiant extends Persona {
    private int curs;
    private String assignatures;
    private String escola;
    private double notes;

    public Estudiant() {

    }

    /**
     * Funció amb els atributs del estudiant
     * @param curs Curs
     * @param assignatures Assignatures
     * @param escola Escola
     * @param notes Notes
     */

    public Estudiant(int curs, String assignatures, String escola, double notes) {
        this.curs = curs;
        this.assignatures = assignatures;
        this.escola = escola;
        this.notes = notes;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public String getAssignatures() {
        return assignatures;
    }

    public void setAssignatures(String assignatures) {
        this.assignatures = assignatures;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public double getNotes() {
        return notes;
    }

    public void setNotes(double notes) {
        this.notes = notes;
    }
}
