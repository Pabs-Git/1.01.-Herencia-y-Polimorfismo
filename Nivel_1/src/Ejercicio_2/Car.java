package Ejercicio_2;

public class Car {

    private static final String brand = "Ferrari";
    private static String model = "V1";
    private final int power;

    public Car(int power) {

        this.power = power;
    }

    // Constructor que recibe tanto modelo como potencia en caso de que se quisiera cambiar "modelo"
    public Car(String model, int power) {
        this.model = model;    // Aquí puedes cambiar el modelo de manera estática
        this.power = power;
    }

    public static String getBrand() {

        return brand;
    }

    public static String getModel() {

        return model;
    }

    public int getPower() {

        return power;
    }

    public static void curb() {

        System.out.println("The car is curbing...");
    }

    public void accelerate() {

        System.out.println("The car is accelerating...");
    }
}
