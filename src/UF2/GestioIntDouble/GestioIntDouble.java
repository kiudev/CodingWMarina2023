package UF2.GestioIntDouble;
import UF2.CalculArrayEnters.CalculArrayEnters;
import UF2.CalculArrayReals.CalculArrayReals;

import java.util.Scanner;

public class GestioIntDouble {
  static Scanner s = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Int o double?");
    String primera_opcio = s.nextLine();

    if (primera_opcio.equals("int")) {
      crearArrayInt();

    }
    else if (primera_opcio.equals("double")) {
      crearArrayDouble();
    }

    System.out.println("Max, min o mitj?");

    calcInt();
    calcDouble();
  }

  public static void calcInt() {
    String opcio_int = s.nextLine();
    CalculArrayEnters programa = new CalculArrayEnters();
    if (opcio_int.equals("max")) {
      int max = programa.calcularMaxim();
      System.out.println("La màxima és de " + max);
    }
    else if (opcio_int.equals("min")) {
      int min = programa.calcularMinim();
      System.out.println("La minima és de " + min);
    }
    else if (opcio_int.equals("mitj")) {
      int mitj = programa.calcularMitjana();
      System.out.println("La mitjana és de " + mitj);
    }
    else {
      System.out.println("Hi ha hagut un error, torna a provar!!");
    }
  }

  public static void calcDouble() {
    String opcio_double = s.nextLine();
    CalculArrayReals programa = new CalculArrayReals();

    if (opcio_double.equals("max")) {
      double max = programa.calcularMaxim();
      System.out.println("La màxima és de " + max);
    }
    else if (opcio_double.equals("min")) {
      double min = programa.calcularMinim();
      System.out.println("La minima és de " + min);
    }
    else if (opcio_double.equals("mitj")) {
      double mitj = programa.calcularMitjana();
      System.out.println("La mitjana és de " + mitj);
    }
    else {
      System.out.println("Hi ha hagut un error, torna a provar!!");
    }
  }

  public static int[] crearArrayInt() {
    int[] array = new int[10];
    return array;
  }
  public static double[] crearArrayDouble() {
    double[] array = new double[10];
    return array;
  }
}

/*Scanner: int o double?
        if (user ha escrit int? SI){
        crearé instancia de la classe calcularINT--> calcularINT programa = new calcularINT();
        int[] array = programa.crearArray(); --> length = 10;
        Sout: Max, min o mijt?

        if (user max?SI) {
        int max = programa.calcularMax();
        }
        else if (user min? SI){
        int min = programa.calcularMin();
        }
        else {
        int mitj = programa.calcularMitj();
        }
        //programa.imprimir(max,min,mitj);
        }
        else if( user ha escrit double? SI){

        }*/
