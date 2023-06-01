//Objectiu: Calcular l'area d'un triangle. Entrem les dades per terminal (valors dinàmics)
//El resultat s'ha d'imprimir a terminal
//quan executem el programa

// Importem la biblioteca Scanner per a poder
// rebre les dades que escrivim a la terminal
import java.util.Scanner;

public class AreaTriangle {
  public static void main (String args[]) {
    // Definim la variable que l'usuari esciurà a la terminal
    Scanner in = new Scanner(System.in);

    //Demanem a l'usuari que escrigui l'amplada del triangle
    System.out.println("Quina seria l'amplada del triangle?");

    //Ens guardem la dada que l'usuari ha escrit en la variable b
    double b = in.nextDouble();
    in.nextLine();

    //Demanem a l'usuari que escrigui l'alçada del triangle
    System.out.println("Quina seria l'alçada del triangle?");
    
    //Ens guardem la dada que l'usuari ha escrit en la variable h
    double h = in.nextDouble();
    in.nextLine();

    //Calculem l'area del triangle: Area = (width*height)/2
    double total = b * h / 2;

    //Imprimim a la terminal el calcul
    System.out.println("L'àrea del triangle serà de " + total + ".");
  }
}
