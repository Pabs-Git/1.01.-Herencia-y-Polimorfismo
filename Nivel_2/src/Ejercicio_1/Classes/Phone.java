package Ejercicio_1.Classes;

public class Phone {

    private String brand;
    private String model;

    public Phone(String brand, String model) {

        this.brand = brand;
        this.model = model;
    }

    public void call(String phoneNumber) {

        System.out.println("You are calling to: " + phoneNumber);

    }
}
