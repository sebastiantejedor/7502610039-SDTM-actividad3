package Taller19.Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Almacenamiento local = new AlmacenamientoLocal();

        GestorArchivos gestorLocal = new GestorArchivos(local);

        gestorLocal.guardarArchivo("documento.txt");
        gestorLocal.recuperarArchivo("documento.txt");
        System.out.println();
        Almacenamiento nube = new AlmacenamientoNube();

        GestorArchivos gestorNube = new GestorArchivos(nube);

        gestorNube.guardarArchivo("foto.jpg");
        gestorNube.recuperarArchivo("foto.jpg");
    }
}

interface Almacenamiento {
    void guardar(String archivo);
    void recuperar(String archivo);
}

class AlmacenamientoLocal implements Almacenamiento {

    @Override
    public void guardar(String archivo) {
        System.out.println("Guardando archivo localmente: " + archivo);
    }

    @Override
    public void recuperar(String archivo) {
        System.out.println("Recuperando archivo del almacenamiento local: " + archivo);
    }
}

class AlmacenamientoNube implements Almacenamiento {

    @Override
    public void guardar(String archivo) {
        System.out.println("Guardando archivo en la nube: " + archivo);
    }

    @Override
    public void recuperar(String archivo) {
        System.out.println("Recuperando archivo desde la nube: " + archivo);
    }
}

class GestorArchivos {

    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardarArchivo(String archivo) {
        almacenamiento.guardar(archivo);
    }

    public void recuperarArchivo(String archivo) {
        almacenamiento.recuperar(archivo);
    }
}
