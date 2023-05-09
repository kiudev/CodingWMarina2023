package UF4.Agenda;

import java.util.ArrayList;
import java.util.List;

/**
 * Agenda
 *
 * @author Daniel Saavedra Escuder
 * @version 30/03/2023
 */

public class Pagina {

    private int dia;
    private int mes;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getCita() {
        return cita;
    }

    public void setCita(String cita) {
        this.cita = cita;
    }

    String cita;

    public void afegirCita(String c) {
        cita = c;
    }

    public void borrarCita(String c) {
        cita = c;
    }

    /**
     *
     * @param titol
     * @return cita
     */
    public Cita cercarCita(String titol) {
        Cita c = new Cita();
        return c;
    }

    /**
     *
     * @param <cita>
     */
    public <cita> void llistarCites() {
        List<cita> citaList = new ArrayList<>();
    }
}
