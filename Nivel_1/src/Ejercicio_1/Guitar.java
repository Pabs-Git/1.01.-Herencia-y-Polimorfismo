package Ejercicio_1;

public class Guitar extends Instrument {

    public Guitar(String name, double price) {

        super(name, price);
    }

    @Override
    public void play() {

        System.out.println("A string instrument is playing: Guitar");
    }
}
