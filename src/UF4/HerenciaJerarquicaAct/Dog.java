package UF4.HerenciaJerarquicaAct;

/**
 * Dog
 *
 * @author Daniel Saavedra Escuder
 * @version 18/04/2023
 */

public class Dog extends Animal {
    // Own behavior
    private void bark() {
        System.out.println("Dog '" + getId() + "' is barking");
    }

    // Overriding super class behavior
    @Override
    public void sound() {
        bark();
    }
}
