import java.util.Scanner;

public class DescompteControlErrors {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        float descuento = 8;
        float compra_min = 100;
        float descuento_max = 10;

        System.out.println("¿Cuál es el precio del producto?");
        float precio = lector.nextFloat();

        float descuentoHecho = 0; 

        if (precio > 0) {

            if (precio >= compra_min) {
            descuentoHecho = precio * descuento / 100;    
                if (descuentoHecho > descuento_max) {
                    precio = precio - descuento_max;
                }
                else {
                    precio = precio - descuentoHecho;
                }
                System.out.println("El precio final es de " + precio + ".");
            }
            
        } else {
            System.out.println("El precio que has puesto no es correcto");
        }
    }
}