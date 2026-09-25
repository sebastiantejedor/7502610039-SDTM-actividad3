package Taller19.Ejercicio3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String nombre) {
        System.out.println("Generando reporte Excel: " + nombre);
    }
}
