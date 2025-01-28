package Ejercicio_2.Main;

import Ejercicio_2.Classes.Car;

public class Main {

    public static void main(String[] args) {

        Car instanceOfCar = new Car(500);
        System.out.println("Brand: " + Car.getBrand());
        System.out.println("Default brand: " + Car.getBrand());
        System.out.println("Power of the car we created: " + instanceOfCar.getPower());

        Car.curb();
        instanceOfCar.accelerate();
    }
}
