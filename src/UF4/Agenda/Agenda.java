package UF4.Agenda;

/**
 * Agenda
 *
 * @author Daniel Saavedra Escuder
 * @version 30/03/2023
 */

public class Agenda {
    
    private int any;

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    /**
     * Aquesta funció avança a la següent pàgina.
     */
    public void avancarPagina() {

    }

    /**
     * Aquesta funció retrocedeix a l'anterior pàgina.
     */
    public void retrocedirPagina() {

    }

    /**
     * Aquesta funció llegeix la actual pàgina.
     *
     * @return pagina
     */
    public Pagina llegirPagina() {
        Pagina p = new Pagina();
        return p;
    }
}
