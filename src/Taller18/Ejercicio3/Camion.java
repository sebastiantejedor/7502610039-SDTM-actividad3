package Taller18.Ejercicio3;

public class Camion implements Conduccion, TransporteMercancia {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el camión");
    }

    @Override
    public void cargarMercancia() {
        System.out.println("Cargando mercancía en el camión");
    }
}
