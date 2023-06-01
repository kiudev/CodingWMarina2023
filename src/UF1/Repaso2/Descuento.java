import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double precio = lector.nextDouble();

        double descuento = 5;
        double compra_min = 20;
        double descuento_max = 8;

        double descuentoHecho = 0;

        if (precio > 0) {
            if (precio >= compra_min) {
                descuentoHecho = precio * descuento / 100;
                if (descuentoHecho > descuento_max) {
                    descuentoHecho = descuento_max;
                }
                precio = precio - descuentoHecho;
            }
            System.out.println("El precio final es de " + precio);
        }
        else {
            System.out.println("ERROR");
        }
    }
}
