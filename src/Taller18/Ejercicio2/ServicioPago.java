package Taller18.Ejercicio2;

class ServicioPago implements PagoFactura {

    @Override
    public void pagarFactura() {
        System.out.println("Se realizó el pago de una factura.");
    }
}