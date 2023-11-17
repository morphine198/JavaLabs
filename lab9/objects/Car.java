package edu.lab9.objects;

import edu.lab9.names.Nameable;
import edu.lab9.prices.Priceable;

public class Car implements Nameable, Priceable {
    private String name;
    private int price;
    public Car (String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void getName() {
        System.out.println("Name: "+name);
    }
    public void getPrice() {
        System.out.println("Price: "+price+" dollars");
    }
}
