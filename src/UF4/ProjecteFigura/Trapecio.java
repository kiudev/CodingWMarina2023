package UF4.ProjecteFigura;

import java.util.Scanner;

public class Trapecio extends Figura {

    private int id;
    private double base_mayor;
    private double base_menor;
    private double altura;

    public Trapecio() {

    }

    public Trapecio(double base_mayor, double base_menor, double altura) {
        this.base_mayor = base_mayor;
        this.base_menor = base_menor;
        this.altura = altura;
    }

    public void leerDatos() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la base mayor");
        base_mayor = s.nextDouble();

        System.out.println("Introduce la base menor");
        base_menor = s.nextDouble();

        System.out.println("Introduce la altura");
        altura = s.nextDouble();

        setBase_mayor(base_mayor);
        setBase_menor(base_menor);
        setAltura(altura);
        setId(4);
        setFigura("trapecio");
    }

    public double calcularArea() {
        return base_mayor + base_menor * altura / 2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBase_mayor() {
        return base_mayor;
    }

    public void setBase_mayor(double base_mayor) {
        this.base_mayor = base_mayor;
    }

    public double getBase_menor() {
        return base_menor;
    }

    public void setBase_menor(double base_menor) {
        this.base_menor = base_menor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
