package Ejercicio_1.Main;

import Ejercicio_1.Classes.Instrument;
import Ejercicio_1.Classes.percussionInstrument;
import Ejercicio_1.Classes.stringInstrument;
import Ejercicio_1.Classes.windInstrument;

public class Main {

    public static void main(String[] args) {

        Instrument flute = new windInstrument("Flute", 120.0);
        Instrument guitar = new stringInstrument("Guitar", 150.0);
        Instrument drum = new percussionInstrument("Drum", 200.0);

        flute.play();
        guitar.play();
        drum.play();
    }
}