public class DibujoEstrellas2 {
    public static void main (String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; i < 6; j++) {
                if (i == 1) {
                    if (j < 2) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else if (i == 2) {
                    if (j >= 2 && j < 4) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else if (i == 0 && i == 4) {
                    if (j >= 2 && j < 4) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
