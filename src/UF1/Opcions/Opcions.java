import java.util.Scanner;
//Un programa que dóna diferents opcions de càlcul, usant la sentència switch.
public class Opcions {
  public static void main (String[] args) {
    Scanner lector = new Scanner(System.in);
    //PAS 1 i 2
    System.out.print("Introdueix un valor enter: ");
    int primerValor = lector.nextInt();
    lector.nextLine();
    System.out.print("Introdueix−ne un altre: ");
    int segonValor = lector.nextInt();
    lector.nextLine();
    //PAS 3 i 4
    System.out.println("Quina operació vols fer? ");
    System.out.println("[1] Sumar");
    System.out.println("[2] Restar");
    System.out.println("[3] Multiplicar");
    System.out.println("[4] Dividir");
    System.out.print("Selecciona l’opció [1−4]: ");
    int opcio = lector.nextInt();
    lector.nextLine();
    int resultat = 0;
    //PAS 5
    switch(opcio) {
      //PAS I
      case 1:
        System.out.print("Has triat sumar...");
        resultat = primerValor + segonValor;
        break;
      //PAS II
      case 2:
        System.out.print("Has triat restar...");
        resultat = primerValor − segonValor;
        break;
      //PAS III
      case 3:
        System.out.print("Has triat multiplicar...");
        resultat = primerValor * segonValor;
        break;
      //PAS IV
      case 4:
        System.out.print("Has triat dividir...");
        resultat = primerValor / segonValor;
        break;
      //PAS V
      default:
        System.out.println("Opció no prevista.");
    }
    //PAS 6
    System.out.println("El resultat és " + resultat + ".");
  }
}
