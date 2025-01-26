package Ejercicio_1;

public class Main {

    public static void main(String[] args) {

        // Acceder a un miembro estático ANTES de crear instancias
        System.out.println("Allowed instruments: " + Instrument.getAllowedInstruments());

        // Crear instancias de instrumentos una vez ya tenemos la clase iniciada.
        Instrument flute = new Flute("Flute", 120.0);
        Instrument guitar = new Guitar("Guitar", 150.0);
        Instrument drum = new Drum("Drum", 200.0);

        flute.play();
        guitar.play();
        drum.play();

        System.out.println("Allowed instruments: " + Instrument.getAllowedInstruments());
    }
}