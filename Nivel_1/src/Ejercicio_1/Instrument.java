package Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public abstract class Instrument {

    private String name;
    private double price;

    // Lista de instrumentos permitidos (estática y global)
    private static final List<String> allowedInstruments = new ArrayList<>();

    // Bloque estático, este bloque se cargara solo la primera vez que llamemos a la clase, ya sea directamente o por instancia.
    static {

        System.out.println("Loading class Instrument...");
        // Inicializar lista de instrumentos permitidos
        allowedInstruments.add("Flute");
        allowedInstruments.add("Guitar");
        allowedInstruments.add("Drum");
    }

    public Instrument(String name, double price) {

        this.name = name;
        this.price = price;
    }

    // Método estático para consultar la lista de instrumentos permitidos
    public static List<String> getAllowedInstruments() {

        return allowedInstruments;
    }

    public abstract void play();
}