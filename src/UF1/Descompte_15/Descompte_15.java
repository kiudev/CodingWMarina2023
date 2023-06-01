import java.util.Scanner;

public class Descompte_15 {
	public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);

	  float DESCOMPTE = 15;
	  float COMPRA_MIN = 95;

	  System.out.println("Quin és el preu del producte?");
	  float preu = in.nextFloat();

	  if (preu >= COMPRA_MIN) {
	    float descompteFet = preu * DESCOMPTE / 95;
	    preu = preu - descompteFet;
      }
	  
	  System.out.println("El preu final per pagar és de " + preu + " euros.");
	}
}
	  



