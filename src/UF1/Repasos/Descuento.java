import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {

        //Iniciamos scanner
        Scanner lector = new Scanner(System.in);
        //Preguntamos cuál es el precio y que el usuario nos lo dé.
        System.out.println("¿Cuál es el precio?");
        double precio = lector.nextDouble();
        //Declaramos variables
        double descuento = 10;
        double compra_min = 50;
        double descuento_max = 20;

        double descuentoHecho = 0;
        //Comprobar si el precio es positivo
        if (precio > 0) {
          //Si precio es mayor que compra minima aplicar el descuento.
            if (precio > compra_min) {
                descuentoHecho = precio * descuento / 100;
                //Si el descuento aplicado es mayor que el descuento máximo reducirlo al máximo que puede descontar.
                if (descuentoHecho > descuento_max) {
                    descuentoHecho = descuento_max;
                }
                //Aplicamos el descuento al precio
                precio = precio - descuentoHecho;
            }
            System.out.println("El precio final será de " + precio + ".");
        }
        else {
            System.out.println("ERROR");
        }
    }
}
