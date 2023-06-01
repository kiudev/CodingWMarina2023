import java.util.Scanner;

public class Descuento20 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Cuánto es el precio?");
        double precio = lector.nextDouble();

        double descuento = 20;
        double compra_min = 300;
        double descuentoHecho = precio * descuento / 100;

        if (precio > 300) {
            precio = precio - descuentoHecho;
            System.out.println(precio);
        }
        else {
            System.out.println("sin descuento");
        }
    }
}
