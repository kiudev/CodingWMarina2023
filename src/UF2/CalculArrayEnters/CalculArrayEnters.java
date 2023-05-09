package UF2.CalculArrayEnters;

public class CalculArrayEnters {

    public int calcularMaxim() {
        int[] array = new int[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int calcularMinim() {
        int[] array = new int[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int calcularMitjana() {
        int[] array = new int[0];
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];
        }
        return suma/array.length;
    }
}
