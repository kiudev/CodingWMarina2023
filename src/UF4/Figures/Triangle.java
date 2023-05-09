package UF4.Figures;

/**
 * Triangle
 *
 * @author Daniel Saavedra Escuder
 * @version 28/03/2023
 */

public class Triangle {
    int costat1;
    int costat2;
    int costat3;
    String color;

    /**
     * @param cos1: costat 1
     * @param cos2: costat 2
     * @param cos3: costat 3
     * @param col: color
     */

    public Triangle(int cos1, int cos2, int cos3, String col) {
        costat1 = cos1;
        costat2 = cos2;
        costat3 = cos3;
        color = col;
    }
}
