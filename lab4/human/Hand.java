package edu.lab4.human;

public class Hand {
    private double weight;
    private double length;
    public Hand(double weight) {
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
