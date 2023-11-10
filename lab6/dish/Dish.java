package edu.lab6.dish;

public abstract class Dish {
    private String name;
    private String material;
    public Dish(String name, String material) {
        this.name = name;
        this.material = material;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getName() {
        return name;
    }
    public String getMaterial() {
        return material;
    }
    public abstract void displayInformation();
}
