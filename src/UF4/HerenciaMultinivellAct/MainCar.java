package UF4.HerenciaMultinivellAct;

/**
 * MainCar
 *
 * @author Daniel Saavedra Escuder
 * @version 18/04/2023
 */

public class MainCar {
    public static void main(String[] args) {
        Car c = new Car();
        c.setId(1);

        Seat s = new Seat();
        s.setModel("Arona");

        Arona a = new Arona();
        a.setColor("Negro");
        a.setKm(50000);
    }
}
