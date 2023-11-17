package edu.lab9;

import edu.lab9.names.Nameable;
import edu.lab9.prices.Priceable;
import edu.lab9.objects.*;

public class InterfaceTester {
    public static void main(String[] args) {
        Nameable nameable = new Car("Car", 10000);
        nameable.getName();
        Priceable priceable = (Car) nameable;
        priceable.getPrice();

        nameable = new Dog("Dog", 5);
        nameable.getName();
        priceable = (Dog) nameable;
        priceable.getPrice();

        nameable = new Laptop("Laptop", 8943);
        nameable.getName();
        priceable = (Laptop) nameable;
        priceable.getPrice();
    }
}
