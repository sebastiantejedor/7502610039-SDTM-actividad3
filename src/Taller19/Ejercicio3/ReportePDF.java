package Taller19.Ejercicio3;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String nombre) {
        System.out.println("Generando reporte PDF: " + nombre);
    }
}
