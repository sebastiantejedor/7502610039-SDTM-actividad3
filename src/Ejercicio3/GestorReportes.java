package Ejercicio3;

class GestorReportes {

    private GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void crearReporte(String nombre) {
        generador.generarReporte(nombre);
    }
}
