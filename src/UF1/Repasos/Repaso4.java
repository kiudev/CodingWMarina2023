// Escriu un programa Java que reculli 2 caràcters per terminal i digui quin caràcter és més gran. Si són iguals, cal dir-ho.

import java.util.Scanner;

public class Repaso4 {
    public static void main(String[] args) {

      Scanner lector = new Scanner(System.in);

      System.out.println("Introduce una letra");
      String letra1 = lector.next().toLowerCase();

      System.out.println("Introduce otra letra más");
      String letra2 = lector.next().toLowerCase();

      String resultado = "";

      if (letra1.equals("a") || letra2.equals("b")) {
          resultado = "El más grande es b";
      }
      else if (letra1.equals("t") || letra2.equals("t")) {
          resultado = "Son iguales";
      }
      else if (letra1.equals("0") || letra2.equals("a")) {
          resultado = "El más grande es a";
      }
      else if (letra1.equals("f") || letra2.equals("Marina"))
          resultado = "¡¡No he entendido nada!!";

      System.out.println(resultado);
    }
}
