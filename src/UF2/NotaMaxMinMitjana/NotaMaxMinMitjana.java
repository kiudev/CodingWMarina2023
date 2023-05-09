package UF2.NotaMaxMinMitjana;

import java.util.Scanner;

public class NotaMaxMinMitjana {
    Scanner s = new Scanner(System.in);

    private double[] arrayNota = new double[5];

    public static void main(String[] args) {
        NotaMaxMinMitjana programa = new NotaMaxMinMitjana();
        programa.inici();
    }

    public void inici() {
        mostrarMenu();
        llegirDades();
        imprimir();
    }

    public void mostrarMenu() {
        System.out.println("Aquesta és una consulta de notes per conèixer la nota màxima, minima i la mitjana");
        System.out.println("Introdueix a continuació les teves 5 notes:");
    }

    public double calculaMax() {
       double max = arrayNota[0];
       for (int i = 0; i < arrayNota.length; i++) {
           if (arrayNota[i] > max) {
               max = arrayNota[i];
           }
       }
       return max;
    }

    public double calculaMin() {
        double min = arrayNota[0];
        for (int i = 0; i < arrayNota.length; i++) {
            if (arrayNota[i] < min) {
                min = arrayNota[i];
            }
        }
        return min;
    }

    public double calculaMitj() {
        double mitjana = arrayNota[0];
        for (int i = 0; i < arrayNota.length; i++) {
            mitjana = mitjana + arrayNota[i];
        }
        mitjana = mitjana / arrayNota.length;
        return mitjana;
    }

    public void llegirDades() {
        for (int i = 0; i < arrayNota.length; i++) {
            arrayNota[i] = s.nextDouble();
            if (arrayNota[i] < 0 || arrayNota[i] > 10) {
                System.out.println("Hi ha hagut un error, torna a provar!");
            } else {
                System.out.println("Nota " + (i+1) + " vàlida");
            }
        }
    }

    public void imprimir() {
        double max = calculaMax();
        double min = calculaMin();
        double mitj = calculaMitj();
        System.out.println("--------------------------------------");
        System.out.println("La nota màxima és: " + max);
        System.out.println("La nota minima és: " + min);
        System.out.println("La nota mitjana és: " + mitj);
    }
}
