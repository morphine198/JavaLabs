package edu.lab8.shapes;

public class Rectangle extends Shape {
    private int width;
    private int height;
    public Rectangle(String colour, int x, int y, int width, int height) {
        super(colour, x, y);
        this.width = width;
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public String returnType() {
        return "RECTANGLE";
    }
}
