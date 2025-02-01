package Ejercicio_1.Main;

import Ejercicio_1.Classes.Smartphone;

public class Main {

    public static void main(String[] args) {

        Smartphone mySmartphone = new Smartphone("Samsung", "Galaxy S21");

        mySmartphone.call("953525953");

        mySmartphone.photograph();

        mySmartphone.alarm();
    }
}
