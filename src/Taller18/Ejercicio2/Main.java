package Taller18.Ejercicio2;

public class Main {
    public static void main(String[] args) {

        ServicioTransferencia transferencia = new ServicioTransferencia();
        transferencia.transferir();

        Cajero cajero = new Cajero();
        cajero.retirar();

        ServicioPago pago = new ServicioPago();
        pago.pagarFactura();
    }
}