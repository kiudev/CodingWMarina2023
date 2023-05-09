package UF2.CalculAreesFuncions;

import java.util.Scanner;

public class CalculAreesFuncions {
    public static void main(String[] args) {
        CalculAreesFuncions programa = new CalculAreesFuncions();
        programa.inici();
    }

    public void inici() {
        mostrarMenu();
        tractarFigura();
    }

    public void mostrarMenu() {
        System.out.println("De quina figura vols calcular l'area?\n");
        System.out.println("Tens les següents opcions: triangle, quadrat, rectangle, trapezi, rombe, paralelogram o cercle.\n");
    }

    public void tractarFigura() {
        Scanner s = new Scanner(System.in);
        String figura = s.nextLine().toLowerCase();

        switch (figura) {
            case "triangle":
                double tri = calculTriangle();
                System.out.println("L'area del " + figura + " es " + tri);
                break;
            case "quadrat":
                double qua = calculQuadrat();
                System.out.println("L'area del " + figura + " es " + qua);
                break;
            case "rectangle":
                double rec = calculRectangle();
                System.out.println("L'area del " + figura + " es " + rec);
                break;
            case "trapezi":
                double tra = calculTrapezi();
                System.out.println("L'area del " + figura + " es " + tra);
                break;
            case "rombe":
                double rom = calculRombe();
                System.out.println("L'area del " + figura + " es " + rom);
                break;
            case "paralelogram":
                double par = calculParalelogram();
                System.out.println("L'area del " + figura + " es " + par);
                break;
            case "cercle":
                double cer = calculCercle();
                System.out.println("L'area del " + figura + " es " + cer);
                break;
        }

    }

    public double calculTriangle() {
        double b = 23.0;
        double h = 8.0;
        double area = (b * h) / 2;
        return area;
    }

    public double calculQuadrat() {
        double r = 37.0;
        double area = Math.pow(r, 2);
        return area;
    }

    public double calculRectangle() {
        double a = 68.0;
        double b = 39.0;
        double area = a * b;
        return area;
    }

    public double calculTrapezi() {
        double a = 35.0;
        double b = 16.0;
        double h = 5.0;
        double area = ((a * b) * h) / 2;
        return area;
    }

    public double calculRombe() {
        double dM = 75.0;
        double dm = 30.0;
        double area = (dM * dm) / 2;
        return area;
    }

    public double calculParalelogram() {
        double b = 45.0;
        double h = 13.0;
        double area = b * h;
        return area;
    }

    public double calculCercle() {
        Scanner s = new Scanner(System.in);
        System.out.println("Quin es el radi del cercle?");
        double r = s.nextDouble();
        double area = Math.pow(r, 2) * Math.PI;
        return area;
    }
}

