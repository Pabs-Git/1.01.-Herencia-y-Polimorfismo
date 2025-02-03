package Ejercicio_1.Classes;

public class percussionInstrument extends Instrument {

    public percussionInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing: Drum");
    }
}
