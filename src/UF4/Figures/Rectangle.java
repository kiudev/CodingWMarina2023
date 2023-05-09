package UF4.Figures;

/**
 * Rectangle
 *
 * @author Daniel Saavedra Escuder
 * @version 28/03/2023
 */

public class Rectangle {
    public int base;
    public int altura;
    public String color;

    /**
     *
     * @param b: base
     * @param a: altura
     * @param c: color
     */

    public Rectangle() { //sobreescribe una constructora con parametros

    }

    public Rectangle(int b, int a, String c) {
        base = b;
        altura = a;
        color = c;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
