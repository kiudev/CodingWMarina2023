package UF4.HerenciaJerarquicaAct;

/**
 * MainAnimal
 *
 * @author Daniel Saavedra Escuder
 * @version 19/04/2023
 */

public class MainAnimal {
    public static void main(String[] args) {
        Animal ani = new Animal();

        Dog dog = new Dog();
        dog.setId(1);
        dog.sound();

        Cat cat = new Cat();
        cat.setId(1);
        cat.sound();
    }
}
