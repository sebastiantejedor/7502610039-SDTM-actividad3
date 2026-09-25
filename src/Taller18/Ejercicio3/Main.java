package Taller18.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Motocicleta moto = new Motocicleta();
        moto.conducir();
        Camion camion = new Camion();
        camion.conducir();
        camion.cargarMercancia();
    }
}
