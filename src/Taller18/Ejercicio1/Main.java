package Taller18.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico();
        tecnico.reparar();

        PersonalLimpieza limpieza = new PersonalLimpieza();
        limpieza.limpiar();
    }
}


interface Reparacion {
    void reparar();
}

interface Limpieza {
    void limpiar();
}

class Tecnico implements Reparacion {
    @Override
    public void reparar() {
        System.out.println("El técnico está realizando una reparación.");
    }
}

class PersonalLimpieza implements Limpieza {
    @Override
    public void limpiar() {
        System.out.println("El personal está realizando la limpieza.");
    }
}

