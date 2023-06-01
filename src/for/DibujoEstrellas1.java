public class DibujoEstrellas1 {
    public static void main (String[] args) {

        int contador = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (contador < 2) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else {
                    if (j % 2 != 0) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            contador++;
            System.out.println("");
        }
    }
}
