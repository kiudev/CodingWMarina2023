package UF4.ProjecteFigura;

import java.util.Scanner;

public class Rectangulo extends Figura {

    private int id;
    private double base;
    private double altura;

    public Rectangulo() {

    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void leerDatos() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la base");
        base = s.nextDouble();

        System.out.println("Introduce la altura");
        altura = s.nextDouble();

        setBase(base);
        setAltura(altura);
        setId(3);
        setFigura("rectángulo");
    }

    public double calcularArea() {
        return base * altura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
