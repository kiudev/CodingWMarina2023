package UF4.ProjecteFigura;

import java.util.Scanner;

public class Circulo extends Figura {

    private int id;
    private double radio;

    public Circulo () {

    }

    public Circulo (double radio) {
        this.radio = radio;
    }

    public void leerDatos() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el radio");
        radio = s.nextDouble();

        setRadio(radio);
        setId(7);
        setFigura("círculo");
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}
