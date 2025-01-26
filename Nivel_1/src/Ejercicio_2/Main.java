package Ejercicio_2;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(500); // Potencia 500
        System.out.println("Brand: " + Car.getBrand());  // Imprime la marca, que es estática
        System.out.println("Default brand: " + Car.getBrand()); // Imprime el modelo por defecto "V1"
        System.out.println("Power of car1: " + car1.getPower()); // Imprime la potencia del coche1

        // Llamamos a los métodos estático y no estático
        Car.curb();   // Método estático
        car1.accelerate(); // Método no estático

        // Crear otro coche utilizando el constructor que permite especificar el modelo
        Car car2 = new Car("V2", 600); // Modelo "V2", Potencia 600
        System.out.println("\nBrand: " + Car.getBrand());
        System.out.println("Model of car2: " + Car.getModel()); // Imprime "V2" porque lo cambiamos
        System.out.println("Power of car2: " + car2.getPower()); // Potencia del coche2

        Car.curb();   // Método estático
        car2.accelerate();  // Método no estático
    }
}
