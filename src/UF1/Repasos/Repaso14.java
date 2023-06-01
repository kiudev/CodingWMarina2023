// Descuento 10%
// Compra mínima 50€
// Descuento máximo 20€

import java.util.Scanner;

public class Repaso14 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double descuento = 10;
        double compra_min = 50;
        double descuento_max = 20;

        System.out.println("¿Cuánto cuesta el producto?");
        double precio = lector.nextDouble();

        if (precio > 0) {
            if (precio >= compra_min) {
                double descuentoHecho = precio * descuento / 100;
            if (descuentoHecho > descuento_max) {
                    descuentoHecho = descuento_max;
                }
                precio = precio - descuentoHecho;
            }
        System.out.println("El precio final es de " + precio);
        }
        else {
            System.out.println("¡¡No has introducido bien el precio!!");
        }
    }
}
