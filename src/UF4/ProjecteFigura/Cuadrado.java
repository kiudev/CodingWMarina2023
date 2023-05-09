package UF4.ProjecteFigura;

import java.util.Scanner;

public class Cuadrado extends Figura {

    private int id;
    private double lado1;
    private double lado2;

    public Cuadrado() {

    }

    public Cuadrado(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void leerDatos() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el primer lado");
        lado1 = s.nextDouble();

        System.out.println("Introduce el segundo lado");
        lado2 = s.nextDouble();

        setLado1(lado1);
        setLado2(lado2);
        setId(2);
        setFigura("cuadrado");
    }

    public double calcularArea() {
        return lado1 * lado2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

}
