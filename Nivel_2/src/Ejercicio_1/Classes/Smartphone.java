package Ejercicio_1.Classes;

import Ejercicio_1.Interfaces.Camera;
import Ejercicio_1.Interfaces.Clock;

public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {

        super(brand, model);
    }

    @Override
    public void photograph() {

        System.out.println("You are doing a photo.");
    }

    @Override
    public void alarm() {

        System.out.println("The alarm is ringing.");
    }
}
