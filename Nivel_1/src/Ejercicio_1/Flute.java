package Ejercicio_1;

public class Flute extends Instrument{

    public Flute(String name, double price) {

        super(name, price);
    }

    @Override
    public void play() {

        System.out.println("A wind instrument is playing: Flute");
    }
}
