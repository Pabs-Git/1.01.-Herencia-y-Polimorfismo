package Ejercicio_1;

public class Drum extends Instrument {

    public Drum(String name, double price) {

        super(name, price);
    }

    @Override
    public void play() {

        System.out.println("A percussion instrument is playing: Drum");
    }
}
