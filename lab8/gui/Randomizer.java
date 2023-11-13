package edu.lab8.gui;

import edu.lab8.shapes.*;

public class Randomizer {
    private int randSize() {
        return (int)(Math.random() * 100);
    }
    private int[] randomizeCoordinatesX() {
        int[] arrayX = new int[4];
        for (int points = 0; points < arrayX.length; points++) {
            arrayX[points] = randSize();
        }
        return arrayX;
    }
    private int[] randomizeCoordinatesY() {
        int[] arrayY = new int[4];
        for (int points = 0; points < arrayY.length; points++) {
            arrayY[points] = randSize();
        }
        return arrayY;
    }
    private String randColour() {
        String colour = "NULL";
        switch ((int)(Math.random() * 3)){
            case 0:
                colour = "RED";
                break;
            case 1:
                colour = "GREEN";
                break;
            case 2:
                colour = "BLUE";
                break;
        }
        return colour;
    }
    public Shape randShape() {
        Shape shape = null;
        String colour = randColour();
        int[] x = new int[4];
        int[] y = new int[4];
        x = randomizeCoordinatesX();
        y = randomizeCoordinatesY();

        int randomShape = (int)(Math.random() * 3);
        switch (randomShape) {
            case 0:
                shape = new Rectangle(colour, x[0], y[0], randSize(), randSize());
                break;
            case 1:
                int[] pA = new int[2];
                int[] pB = new int[2];
                int[] pC = new int[2];
                pA[0] = x[1]; pA[1] = y[1];
                pB[0] = x[2]; pB[1] = y[2];
                pC[0] = x[3]; pC[1] = y[3];
                shape = new Triangle(colour, x[0], y[0], pA, pB, pC);
                break;
            case 2:
                shape = new Oval(colour, x[0], y[0], randSize(), randSize());
                break;
        }
        return shape;
    }
}
