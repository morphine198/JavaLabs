package edu.lab8.shapes;

public class Triangle extends Shape {
    private int[] positionA = new int[2];
    private int[] positionC = new int[2];
    private int[] positionB = new int[2];
    public Triangle(String colour, int x, int y, int[] positionA, int[] positionB, int[] positionC) {
        super(colour, x, y);
        this.positionA = positionA;
        this.positionB = positionB;
        this.positionC = positionC;
    }
    public void setPositionA(int x, int y) {
        positionA[0] = x;
        positionA[1] = y;
    }
    public void setPositionB(int x, int y) {
        positionB[0] = x;
        positionB[1] = y;
    }
    public void setPositionC(int x, int y) {
        positionC[0] = x;
        positionC[1] = y;
    }
    public int[] getPositionA() {
        return positionA;
    }
    public int[] getPositionB() {
        return positionB;
    }
    public int[] getPositionC() {
        return positionC;
    }
}
