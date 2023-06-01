import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?");
        String nombre = lector.nextLine();

        System.out.println("Hola " + nombre + ".");
    }
}
