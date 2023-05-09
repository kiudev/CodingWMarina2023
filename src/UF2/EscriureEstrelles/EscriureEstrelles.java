package UF2.EscriureEstrelles;

public class EscriureEstrelles {
    public static void main(String[] args) {
        EscriureEstrelles programa = new EscriureEstrelles();
        programa.inici();
    }

    public void inici() {
        estrellar(4);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
    }

    public void estrellar(int j) {
        for (int i = 0; i < j; i++) {
            System.out.print("*");
        }
        System.out.println(" ");
    }
}