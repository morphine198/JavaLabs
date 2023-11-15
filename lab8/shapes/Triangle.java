package edu.lab8.shapes;

public class Triangle extends Shape {
    private int[] positionX = new int[3];
    private int[] positionY = new int[3];
    public Triangle(String colour, int x, int y, int[] positionX, int[] positionY) {
        super(colour, x, y);
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void setArrPositionX(int p1, int p2, int p3) {
        positionX[0] = p1;
        positionX[1] = p2;
        positionX[2] = p3;
    }
    public void setArrPositionY(int p1, int p2, int p3) {
        positionY[0] = p1;
        positionY[1] = p2;
        positionY[2] = p3;
    }
    public int[] getArrPositionX() {
        return positionX;
    }
    public int[] getArrPositionY() {
        return positionY;
    }
    public String returnType() {
        return "TRIANGLE";
    }
}
