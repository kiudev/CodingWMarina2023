public class InicializacioParells {
    public static void main(String[] args) {

        int[] arrayPares = new int[100];

        for (int i = 0; i < arrayPares.length; i++) {
            arrayPares[i] = 2 * i;
        }
        System.out.print("S'ha generat l'array: [");

        for (int i = 0; i < arrayPares.length; i++) {
            System.out.print(arrayPares[i] + " ");
        }
        System.out.print("]");
    }
}
