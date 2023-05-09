package UF4.ProjecteFigura;

import java.util.Scanner;

public class Rombo extends Figura {

    private int id;
    private double diagonal_mayor;
    private double diagonal_menor;

    public Rombo() {

    }

    public Rombo(double diagonal_mayor, double diagonal_menor) {
        this.diagonal_mayor = diagonal_mayor;
        this.diagonal_menor = diagonal_menor;
    }

    public void leerDatos() {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la diagonal mayor");
        diagonal_mayor = s.nextDouble();

        System.out.println("Introduce la diagonal menor");
        diagonal_menor = s.nextDouble();

        setDiagonal_mayor(diagonal_mayor);
        setDiagonal_menor(diagonal_menor);
        setId(5);
        setFigura("rombo");
    }

    public double calcularArea() {
        return diagonal_mayor * diagonal_menor / 2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDiagonal_mayor() {
        return diagonal_mayor;
    }

    public void setDiagonal_mayor(double diagonal_mayor) {
        this.diagonal_mayor = diagonal_mayor;
    }

    public double getDiagonal_menor() {
        return diagonal_menor;
    }

    public void setDiagonal_menor(double diagonal_menor) {
        this.diagonal_menor = diagonal_menor;
    }

}
