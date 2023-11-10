package edu.lab6.furniture;

class Chair extends Furniture{
    private int legs;
    public Chair(String name, String material, int legs) {
        super(name, material);
        this.legs = legs;
    }
    public void displayInformation() {
        System.out.println("Name "+getName()+" Material "+getMaterial()+" Legs "+legs);
    }
}
