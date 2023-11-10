package edu.lab8.shapes;

public abstract class Shape {
    private String colour;
    private int[] position;
    public Shape(String colour, int x, int y) {
        this.colour = colour;
        position = new int[2];
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setPosition(int x, int y) {
        position[0] = x;
        position[1] = y;
    }
    public String getColour() {
        return colour;
    }
    public int getPositionX() {
        return position[0];
    }
    public int getPositionY() {
        return position[1];
    }
}
