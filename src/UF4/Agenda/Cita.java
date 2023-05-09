package UF4.Agenda;

/**
 * Agenda
 *
 * @author Daniel Saavedra Escuder
 * @version 30/03/2023
 */

public class Cita {

    private int hora;
    private int minuts;
    private String titol;
    private String text;

    public Cita() {
        
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuts() {
        return minuts;
    }

    public void setMinuts(int minuts) {
        this.minuts = minuts;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Cita(int hora, int minuts, String titol, String text) {
        this.hora = hora;
        this.minuts = minuts;
        this.titol = titol;
        this.text = text;
    }

    /**
     *
     * @param text
     * @return text
     */
    public String modificarText(String text) {
        return text;
    }
}
