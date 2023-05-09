package UF2.MaxMinMitj;
import java.util.Scanner;
public class CalculanotaMaxMinMitj10 {
    //crea scanner per l'usuari
    private Scanner s = new Scanner(System.in);
    //crea un vector double de 5 valors
    private double[] llistaNum = new double[5];

    public static void main(String[] args) {
        //inicialitzem el programa des de la funció inici
        CalculanotaMaxMinMitj10 programa = new CalculanotaMaxMinMitj10();
        programa.inici();
    }
    public void inici() {
        //executem les següents funcions
        mostrarMenu();
        llegirDades();
        imprimir();
    }
    private void mostrarMenu() {
        //fem un print per preguntar a l'usuari
        System.out.print("Hola!! Et donem la benvinguda al calcul de nota màxima, mínima i mitjana (:\n");
    }
    private void llegirDades() {
        //fem un bucle de 5 vegades per introduïr les notes
        System.out.println("Escriu 5 valors.");
        for (int i = 0; i < llistaNum.length;++i){
            llistaNum[i] = s.nextDouble();
        }
    }
    //creem una funció de entrada per retornar la variable notaMax
    private double calculaMax() {
        //fem un bucle que recorri tot el vector per cercar el valor màxim
        double notaMax = llistaNum[0];
        for (int i = 0; i < llistaNum.length; i++) {
            if (llistaNum[i] > notaMax) {
                notaMax = llistaNum[i];
            }
        }
        return notaMax;
    }
    //creem una funció de entrada per retornar la variable notaMin
    private double calculaMin() {
        //fem un bucle que recorri tot el vector per cercar el valor minim
        double notaMin = llistaNum[0];
        for (int i = 0; i < llistaNum.length; i++) {
            if (llistaNum[i] < notaMin) {
                notaMin = llistaNum[i];
            }
        }
        return notaMin;
    }
    //creem una funció de entrada per retornar la variable mitjana
    private double calculaMitjana() {
        //fem un bucle que recorri tot el vector per cercar la mitjana
        double mitjana = llistaNum[0];
        for (int i = 0; i < llistaNum.length; i++) {
            mitjana = mitjana + llistaNum[i];
        }
        mitjana = mitjana/llistaNum.length;
        return mitjana;
    }
    private void imprimir() {
        //sortim les 3 variables anteriors
        double notaMax = calculaMax();
        double notaMin = calculaMin();
        double mitjana = calculaMitjana();
        //fem 3 prints amb les 3 variables com a resultat
        System.out.print("El num més gran es: " + notaMax + "\n");
        System.out.print("El num més petit es: " + notaMin + "\n");
        System.out.print("La mitjana es: " + mitjana + "\n");

    }
}