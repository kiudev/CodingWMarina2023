package UF2.CercaValors;

import java.util.Arrays;
import java.util.Random;

public class CercaValors {

    Random rd = new Random();

    int[] array = new int[10];

    public static void main(String[] args) {
        CercaValors programa = new CercaValors();
        programa.inici();
    }

    public void inici() {
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(11);
        }
        arrayValors();
        imprimir();
    }

    private void arrayValors() {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public int[] cercantValors() {
        int copia1[] = Arrays.copyOfRange(array, 0, 5);
        System.out.print("Valors a cercar: [ ");
        for (int i = 0; i < copia1.length; i++) {
            System.out.print(copia1[i] + " ");
        }
        System.out.println("]");
        return copia1;
    }

    private int[] cercantArray() {
        int copia2[] = Arrays.copyOfRange(array, 5, array.length);
        Arrays.sort(copia2);
        System.out.print("Array on es cerca: [ ");
        for (int i = 0; i < copia2.length; i++) {
            System.out.print(copia2[i] + " ");
        }
        System.out.println("]");
        return copia2;
    }

    private void imprimir() {
        int[] copia1 = cercantValors();
        int[] copia2 = cercantArray();

        for (int i = 0; i < copia1.length; i++) {
            boolean trobat = false;
            for (int j = 0; j < copia2.length; j++) {
                if (copia1[i] == copia2[j] && !trobat) {
                    System.out.println("A la posicio " + Arrays.binarySearch(copia2, copia1[i]) + " hi ha el valor " + copia1[i]);
                    trobat = true;
                }
            }
        }
    }
}
