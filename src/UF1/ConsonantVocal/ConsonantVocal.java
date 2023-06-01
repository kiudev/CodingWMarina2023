import java.util.Scanner;

public class ConsonantVocal {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Dame una letra y te diré si es una vocal o una consonante");
        String letra = lector.next().toLowerCase();

        String resultado = "";

        boolean mayus = letra.charAt(0) >= 65 && letra.charAt(0) <= 90;
        boolean minus = letra.charAt(0) >= 97 && letra.charAt(0) <= 122;

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            resultado = "Vocal";
        }
        else if (letra.equals("b") || letra.equals("c") || letra.equals("d") || letra.equals("f") || letra.equals("g")
        || letra.equals("h") || letra.equals("j") || letra.equals("k") || letra.equals("l")
        || letra.equals("m") || letra.equals("n") || letra.equals("p") || letra.equals("q")
        || letra.equals("r") || letra.equals("s") || letra.equals("t") || letra.equals("v")
        || letra.equals("x") || letra.equals("z") || letra.equals("w") || letra.equals("z")) {
            resultado = "Consonante";
        }
        else {
            System.out.println("¡¡Error, vuelve a intentarlo!!");
        }

        System.out.println(resultado);
    }
}
