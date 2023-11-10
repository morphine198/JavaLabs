package edu.lab4.human;

public class Head {
    private double weight;
    private boolean isHaveBrain;
    public Head(double weight) {
        this.weight = weight;
    }
    public void setIsHaveBrain(boolean isHaveBrain) {
        this.isHaveBrain = isHaveBrain;
    }
    public double getWeight() {
        return weight;
    }

    public boolean getIsHaveBrain() {
        return isHaveBrain;
    }
}
