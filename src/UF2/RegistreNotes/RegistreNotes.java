package UF2.RegistreNotes;

import UF2.CalculArrayReals.CalculArrayReals;

public class RegistreNotes {
    public static void main(String[] args) {
        double[] notes = {2.0, 5.5, 7.25, 3.0, 9.5, 8.25, 7.0, 7.5};
        CalculArrayReals calculador = new CalculArrayReals();
        double max = calculador.calcularMaxim();
        double min = calculador.calcularMinim();
        double mitjana = calculador.calcularMitjana();
        System.out.println("La nota màxima és " + max + ".");
        System.out.println("La nota mínima és " + min + ".");
        System.out.println("La mitjana de les notes és " + mitjana + ".");
    }
}
