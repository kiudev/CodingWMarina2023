package UF4.ProjecteFigura;


public class Figura extends MainFigura {

    private String figura;
    private int id;

    public void imprimirDatos() {
        double area = calcularArea();

        System.out.println("La figura con id " + getId() + " es un " + getFigura() + ".\nEl área del " + getFigura() + " es: " + area);
        System.out.println("-----------------------------");
    }

    public void siguienteFigura() {
        System.out.println("¿Cúal es la siguiente figura que quieres probar?");
        System.out.println("Escribe una de estas figuras [Triangulo, Cuadrado, Rectangulo, Rombo, Paralelogramo o Circulo] o si quieres terminar aquí escribe [fin]");
    }

    public double calcularArea() {
        return 0;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
