package UF4.Societat;

import UF4.Persona.Persona;

public class MainSocietat {
    public static void main(String[] args) {
        Persona p1 = new Persona("00000000N", "Daniel", 25);

        Persona p2 = new Persona();
        p2.setDni("11111111N");
        p2.setNom("Pepe");
        p2.setEdat(55);

        Persona p3 = new Persona("22222222N", "Manolo");
        p3.setEdat(40);

        Persona p4 = new Persona("33333333N");
        p4.setNom("Alba");
        p4.setEdat(8);

        Persona p5 = new Persona("44444444N", 32);
        p5.setNom("Cristina");

        Persona p6 = new Persona(3);
        p6.setDni("55555555N");
        p6.setNom("Joan");


        p1.visualitzar();
        p2.visualitzar();
        p3.visualitzar();
        p4.visualitzar();
        p5.visualitzar();
        p6.visualitzar();
    }
}
