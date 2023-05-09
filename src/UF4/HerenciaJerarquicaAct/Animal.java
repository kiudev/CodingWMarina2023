package UF4.HerenciaJerarquicaAct;

/**
 * Animal
 *
 * @author Daniel Saavedra Escuder
 * @version 19/04/2023
 */

public class Animal {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void sound() {
        System.out.println("By default it is mute");
    }
}
