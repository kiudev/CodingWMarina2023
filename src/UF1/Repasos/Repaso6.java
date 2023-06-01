//UTILITZEU EL SWITCH. Escriu un programa Java que depenent de la paraula que
//l’usuari escrigui per terminal, imprimeixi un missatge específic.
//- Inputs acceptades pel programa: samsung, xiaomi, iphone
//- En cas que l’usuari escrigui …
//- samsung—> Output: “Buy a Samsung phone”
//- xiaomi —> Output: “Buy a Xiaomi phone”
//- iphone —> Output: “Buy an iPhone”

import java.util.Scanner;

public class Repaso6 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Cuál de estas 3 marcas elegirías para comprar tu teléfono móvil [Samsung, Xiaomi o iPhone]?");
        String telefono = lector.next().toLowerCase();

        String marca = "";

        switch (telefono) {
            case "samsung":
                marca = "Buy a Samsung phone";
            break;
            case "xiaomi":
                marca = "Buy a Xiaomi phone";
            break;
            case "iphone":
                marca = "Buy an iPhone";
            break;
            default:
                marca = "¡¡Esta marca no entra entre las 3!!";
        }

        System.out.println(marca);
    }
}
