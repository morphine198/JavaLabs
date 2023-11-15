package edu.lab8.gui;

import edu.lab8.shapes.*;

public class Randomizer {
    private static int randSize() {
        return (int)(Math.random() * 600);
    }
    private static int[] randomizeCoordinatesX() {
        int[] arrayX = new int[4];
        for (int points = 0; points < arrayX.length; points++) {
            arrayX[points] = randSize();
        }
        return arrayX;
    }
    private static int[] randomizeCoordinatesY() {
        int[] arrayY = new int[4];
        for (int points = 0; points < arrayY.length; points++) {
            arrayY[points] = randSize();
        }
        return arrayY;
    }
    private static String randColour() {
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
    public static Shape randShape() {
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
                int[] X = new int[3];
                int[] Y = new int[3];
                for (int r = 1; r < x.length; r++) {
                    X[r-1] = x[r];
                    Y[r-1] = y[r];
                }
                shape = new Triangle(colour, x[0], y[0], X, Y);
                break;
            case 2:
                shape = new Oval(colour, x[0], y[0], randSize(), randSize());
                break;
        }
        return shape;
    }
}
