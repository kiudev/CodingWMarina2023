import java.util.Scanner;

public class IVA {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Cuál es el precio del producto?");
        double precio = lector.nextDouble();

        double iva = 21;

        double ivaPuesto = precio * iva / 100;

        precio = precio + ivaPuesto;

        System.out.println(precio); 
    }
}
