//UTILITZEU EL SWITCH. Escriu un programa Java que demani dos enters per terminal.
// A més a més, l’usuari ha d’indicar quina operació vol fer. Depenent del signe que l’usuari entri per terminal (+,-, /, *) faci l’operació que pertoca.
// Gestioneu els errors en cas que l’usuari entri una paraula i si aquest char és o no un dels símbols acceptats (+,-, /, *).

import java.util.Scanner;

public class Repaso7 {
    public static void main(String[] args) {

      Scanner lector = new Scanner(System.in);

      System.out.println("Necesito saber qué operación quieres hacer");
      System.out.println("(+) Suma, (-) Resta, (/) División, (*) Multiplicación");
      String opcion = lector.nextLine();

      System.out.println("¿Cuál es el primer número que quieres calcular?");
      int num1 = lector.nextInt();

      System.out.println("¿Y el segundo número?");
      int num2 = lector.nextInt();

      String operacion = "";
      int resultado = 0;

      switch (opcion) {
          case "+":
              operacion = "Has elegido hacer una suma";
              resultado = num1 + num2;
              break;
          case "-":
              operacion = "Has elegido hacer una resta";
              resultado = num1 - num2;
              break;
          case "/":
              operacion = "Has elegido hacer una división";
              resultado = num1 / num2;
              break;
          case "*":
              operacion = "Has elegido hacer una multiplicación";
              resultado = num1 * num2;
              break;
          default:
              System.out.println("Te has equivocado al hacer la operación, vuelve a intentarlo.");
      }

      System.out.println(operacion);
      System.out.println(resultado);
    }
}
