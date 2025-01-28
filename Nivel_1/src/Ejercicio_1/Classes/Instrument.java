package Ejercicio_1.Classes;

public abstract class Instrument {

    private String name;
    private double price;

    static {

        System.out.println("Loading class Instrument...");
    }

    public Instrument(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public abstract void play();
}