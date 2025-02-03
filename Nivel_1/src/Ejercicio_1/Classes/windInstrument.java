package Ejercicio_1.Classes;

public class windInstrument extends Instrument {

    public windInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing: Flute");
    }
}
