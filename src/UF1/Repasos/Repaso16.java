// Desarrolle un programa que pida cuantos hombres y mujeres hay en un aula y permita calcular el porcentaje de hombres y mujeres.

import java.util.Scanner;

public class Repaso16 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Cuántos hombres hay en esta clase?");
        int hombres = lector.nextInt();

        System.out.println("¿Cuántas mujeres hay en esta clase?");
        int mujeres = lector.nextInt();

        int suma = hombres + mujeres;
        double porcHombres = hombres * 100 / suma;
        double porcMujeres = mujeres * 100 / suma;

        System.out.println("El porcentaje de hombres es de " + porcHombres + " y de mujeres es de " +  mujeres + ".");
    }
}
