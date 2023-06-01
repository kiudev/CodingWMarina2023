import java.util.Scanner;

public class CalculAreas {
	public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double area = 0;

        System.out.println("¿Qué polígono quieres calcular?");
        String figura = lector.nextLine();

        if (figura.equals("Triangulo")){
             System.out.println("¿Cuánto es la base?");
             double base = lector.nextDouble();
             System.out.println("¿Cuánto es la altura?");
             double altura = lector.nextDouble();
             area = base * altura / 2;

             System.out.println("El resultado del área será de " + area + ".");
        }

        if (figura.equals("Cuadrado")){
            System.out.println("¿Cuánto es el lado?");
            double lado = lector.nextDouble();
            area = lado * lado;

            System.out.println("El resultado del área será de " + area + ".");
        }

        if (figura.equals("Rectangulo")){
            System.out.println("¿Cuánto es la base?");
            double base = lector.nextDouble();
            System.out.println("¿Cuánto es la altura?");
            double altura = lector.nextDouble();
            area = base * altura;

            System.out.println("El resultado del área será de " + area + ".");
        }

        if (figura.equals("Trapecio")){
            System.out.println("¿Cuánto es la base mayor?");
            double base_mayor = lector.nextDouble();
            System.out.println("¿Cuánto es la base menor?");
            double base_menor = lector.nextDouble();
            System.out.println("¿Cuánto es la altura?");
            double altura = lector.nextDouble();
            area = base_mayor * base_menor * altura / 2;

            System.out.println("El resultado del área será de " + area + ".");
        }

        if (figura.equals("Rombo")){
            System.out.println("¿Cuánto es la diagonal mayor?");
            double diagonal_mayor = lector.nextDouble();
            System.out.println("¿Cuánto es la diagonal menor?");
            double diagonal_menor = lector.nextDouble();
            area = diagonal_mayor * diagonal_menor / 2;

            System.out.println("El resultado del área será de " + area + ".");
        }

        if (figura.equals("Paralelogramo")){
            System.out.println("¿Cuánto es la base?");
            double base = lector.nextDouble();
            System.out.println("¿Cuánto es la altura?");
            double altura = lector.nextDouble();
            area = base * altura;

            System.out.println("El resultado del área será de " + area + ".");
        }

        if (true) {
            System.out.println("No se han podido introducir tus datos");

        }else if (false) {
        }
    }
}