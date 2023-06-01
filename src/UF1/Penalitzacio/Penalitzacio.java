import java.util.Scanner;

public class Penalitzacio {
	public static void main(String[] args) {

	  float PENALITZACIO = 2;
	  float COMPRA_MIN = 30;

      Scanner compra = new Scanner(System.in);

	  System.out.println("Quin és el preu del producte?");
	  float preu = compra.nextFloat();

	  if (preu > COMPRA_MIN) {
	    preu = preu + PENALITZACIO;
      }
	  
	  System.out.println("El preu final per pagar és de " + preu + " euros.");
	}
}
	  