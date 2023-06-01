public class TrobarMaxMinOrdenat {
    public static void main(String[] args) {

        int[] array = {12, 3, 45, -3, 65, -5, 88, 99, 2, 23, 54, 33, 27, 53, 96, 0};

        int aux = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        int petit = 0;
        int gran = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < petit) {
                petit = array[i];
            }
            if (array[i] > gran) {
                gran = array[i];
            }
        }

        System.out.println("El numero més petit es: " + petit);
        System.out.println("El numero més gran es: " + gran);
    }
}
