import java.util.Scanner;

public class MultiplicacioDinamica {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Dona'm el primer valor de la multiplicació.");
    int a = in.nextInt();
    in.nextLine();

    System.out.println("Dona'm el segon valor de la multiplicació.");
    int b = in.nextInt();
    in.nextLine();

    int total = a * b;

    System.out.println("La multiplicació dels valors és " + total + ".");
  }
}