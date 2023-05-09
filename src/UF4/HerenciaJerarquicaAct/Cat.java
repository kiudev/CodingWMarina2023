package UF4.HerenciaJerarquicaAct;

/**
 * Cat
 *
 * @author Daniel Saavedra Escuder
 * @version 19/04/2023
 */

public class Cat extends Animal{
    private void meow() {
        System.out.println("Cat '" + getId() + "' is meowing");
    }

    @Override
    public void sound() {
        meow();
    }
}
