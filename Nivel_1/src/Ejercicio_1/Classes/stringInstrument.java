package Ejercicio_1.Classes;

public class stringInstrument extends Instrument {

    public stringInstrument(String name, double price) {

        super(name, price);
    }

    @Override
    public void play() {

        System.out.println("A string instrument is playing: Guitar");
    }
}
