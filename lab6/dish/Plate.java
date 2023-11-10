package edu.lab6.dish;

class Plate extends Dish {
    private double radius;
    public Plate(String name, String material, double radius) {
        super(name, material);
        this.radius = radius;
    }
    public void displayInformation() {
        System.out.println("Name "+getName()+" Material "+getMaterial()+" Radius "+radius);
    }
}
