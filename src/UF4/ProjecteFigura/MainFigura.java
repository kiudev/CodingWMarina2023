package UF4.ProjecteFigura;

import java.util.Scanner;

public class MainFigura {

    public static String figura;
    public boolean fin;

    public static void main(String[] args) {
        MainFigura programa = new MainFigura();
        programa.inicio();
    }

    public void inicio() {
        Scanner s = new Scanner(System.in);

        Figura fig = new Figura();

        leerFigura();
        imprimirFigura();
        while (!fin) {
            fig.siguienteFigura();
            figura = s.nextLine().toLowerCase();
            imprimirFigura();
        }
    }

    public void leerFigura() {
        Scanner s = new Scanner(System.in);

        System.out.println("¿Qué figura te gustaría calcular?");
        System.out.println("Escribe una de estas figuras [Triangulo, Cuadrado, Rectangulo, Rombo, Paralelogramo o Circulo] o si quieres terminar aquí escribe [fin].");
        figura = s.nextLine().toLowerCase();
    }

    public void imprimirFigura() {
        if (figura.equals("triangulo")) {
            Triangulo triangulo = new Triangulo();

            triangulo.leerDatos();
            triangulo.imprimirDatos();
        }
        else if (figura.equals("cuadrado")) {
            Cuadrado cuadrado = new Cuadrado();

            cuadrado.leerDatos();
            cuadrado.imprimirDatos();
        }
        else if (figura.equals("rectangulo")) {
            Rectangulo rectangulo = new Rectangulo();

            rectangulo.leerDatos();
            rectangulo.imprimirDatos();
        }
        else if (figura.equals("trapecio")) {
            Trapecio trapecio = new Trapecio();

            trapecio.leerDatos();
            trapecio.imprimirDatos();
        }
        else if (figura.equals("rombo")) {
            Rombo rombo = new Rombo();

            rombo.leerDatos();
            rombo.imprimirDatos();
        }
        else if (figura.equals("paralelogramo")) {
            Paralelogramo paralelogramo = new Paralelogramo();

            paralelogramo.leerDatos();
            paralelogramo.imprimirDatos();
        }
        else if (figura.equals("circulo")) {
            Circulo circulo = new Circulo();

            circulo.leerDatos();
            circulo.imprimirDatos();
        }
        else if (figura.equals("fin")) {
            System.out.println("El programa ha terminado. ¡¡Hasta pronto!!");
            fin = true;
        }
        else {
            System.out.println("Intentalo de nuevo");
        }
    }

}