package UF2.MitjanaMaxima;

import UF2.CalculArrayReals.CalculArrayReals;

import java.util.Scanner;

public class MitjanaMaxima {

    public static void main(String[] args) {
        double[] arrayA = new double[5];
        primerArray(arrayA);
        double[] arrayB = new double[5];
        segonArray(arrayB);

        CalculArrayReals calculador = new CalculArrayReals();
        double mitjanaA = calculador.calcularMitjana();
        double mitjanaB = calculador.calcularMitjana();

        resultatMitjana(mitjanaA, mitjanaB);
    }

    public static double[] primerArray(double[] arrayA) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix els valors del primer array");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = s.nextDouble();
        }
        return arrayA;
    }

    public static double[] segonArray(double[] arrayB) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix els valors del segon array");
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = s.nextDouble();
        }
        return arrayB;
    }

    public static void resultatMitjana(double mitjanaA, double mitjanaB) {
        if (mitjanaA > mitjanaB) {
            System.out.println("arrayA té una mitjana més alta.");
        }
        else if (mitjanaA < mitjanaB) {
            System.out.println("arrayB té una mitjana més alta.");
        }
        else {
            System.out.println("Les dues mitjanes són iguals!");
        }
    }
}
