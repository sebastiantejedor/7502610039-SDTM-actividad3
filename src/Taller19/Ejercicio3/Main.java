package Taller19.Ejercicio3;

public class Main {

    public static void main(String[] args) {

        // Generar reporte PDF
        GeneradorReporte pdf = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(pdf);
        gestorPDF.crearReporte("Reporte de ventas");

        System.out.println();

        // Generar reporte Excel
        GeneradorReporte excel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(excel);
        gestorExcel.crearReporte("Reporte de estudiantes");
    }
}
