package edu.lab4.human;

public class Leg {
    private double weight;
    private double length;
    public Leg(double weight) {
        this.weight = weight;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWeight() {
        return weight;
    }
    public double getLength() {
        return length;
    }
}
