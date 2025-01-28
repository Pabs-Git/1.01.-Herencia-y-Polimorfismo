package Ejercicio_2.Classes;

public class Car {

    private static final String brand = "Ferrari";
    private static String model = "V1";
    private final int power;

    public Car(int power) {

        this.power = power;
    }

    public static String getBrand() {

        return brand;
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
