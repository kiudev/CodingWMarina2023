import java.util.Scanner;

public class Multiplicacio3Reals {
	public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);

	  System.out.println("Farem una multiplicació de 3 nombres reals");

	  System.out.println("Escriu un nombre i premeu la tecla de retorn: ");
	  double a = in.nextDouble();
      in.nextLine();

      System.out.println("Repeteix una altra vegada: ");
	  double b = in.nextDouble();
      in.nextLine();

      System.out.println("Fes-ho un altre cop: ");
	  double c = in.nextDouble();
      in.nextLine();

      double total = a * b * c;

      System.out.println("El resultat del valors serà de " + total + ".");
	}
}