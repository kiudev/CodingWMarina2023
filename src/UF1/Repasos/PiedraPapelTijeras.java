import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        String movJugador, movPC, ppt, resultado;

        System.out.println("¿Piedra, papel o tijeras?");
        movJugador = lector.next().toLowerCase();

        ppt = ("piedra" + "papel" + "tijeras");
        movPC = ppt[new Random().nextInt(ppt.length)];

        resultado = "";

        if (movJugador.equals("piedra")) {
            if (movPC.equals("tijeras")) {
                resultado = "¡Has ganado!";
            }
            else if (movPC.equals("papel")) {
                resultado = "¡Has perdido!";
            }
        }
        else if (movJugador.equals("papel")) {
            if (movPC.equals("piedra")) {
                resultado = "¡Has ganado!";
            }
            else if (movPC.equals("tijeras")) {
                resultado = "¡Has perdido!";
            }
        }
        else if (movJugador.equals("tijeras")) {
            if (movPC.equals("papel")) {
                resultado = "¡Has ganado!";
            }
            else if (movPC.equals("piedra")) {
                resultado = "¡Has perdido!";
            }
        }
        else {
            resultado = "¡¡Mano incorrecta!!";
        }

        System.out.println(resultado);
    }
}
