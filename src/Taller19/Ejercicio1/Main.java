package Taller19.Ejercicio1;

public class Main {
    public static void main(String[] args) {

        ServicioAutenticacion local = new AutenticacionLocal();

        GestorAutenticacion gestorLocal =
                new GestorAutenticacion(local);

        gestorLocal.iniciarSesion("Sebastian", "12345");


        System.out.println();

        ServicioAutenticacion oauth = new AutenticacionOAuth();

        GestorAutenticacion gestorOAuth =
                new GestorAutenticacion(oauth);

        gestorOAuth.iniciarSesion("Sebastian", "12345");
    }
}

interface ServicioAutenticacion {
    void autenticar(String usuario, String contraseña);
}

class AutenticacionLocal implements ServicioAutenticacion {

    @Override
    public void autenticar(String usuario, String contraseña) {
        System.out.println("Autenticando usuario de forma local...");
        System.out.println("Usuario: " + usuario);
        System.out.println("Autenticación local exitosa.");
    }
}

class AutenticacionOAuth implements ServicioAutenticacion {

    @Override
    public void autenticar(String usuario, String contraseña) {
        System.out.println("Autenticando usuario mediante OAuth...");
        System.out.println("Usuario: " + usuario);
        System.out.println("Autenticación OAuth exitosa.");
    }
}

class GestorAutenticacion {

    private ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void iniciarSesion(String usuario, String contraseña) {
        servicio.autenticar(usuario, contraseña);
    }
}
