package edu.lab8.gui.drawing.shapes;

import edu.lab8.gui.Randomizer;
import edu.lab8.shapes.Shape;
import edu.lab8.shapes.Rectangle;
import edu.lab8.shapes.Triangle;
import edu.lab8.shapes.Oval;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ShapesDrawing {
    private JFrame frame;
    private JPanel panel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ShapesDrawing().createAndShowGui();
            }
        });
    }

    public void createAndShowGui() {
        frame = new JFrame(getClass().getSimpleName());
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (int i = 0; i < 20; i++) {
                    Shape shape = Randomizer.randShape();
                    switch (shape.getColour()) {
                        case "RED":
                            g.setColor(Color.RED);
                            break;
                        case "GREEN":
                            g.setColor(Color.GREEN);
                            break;
                        case "BLUE":
                            g.setColor(Color.BLUE);
                            break;
                        case "NULL":
                            break;
                    }
                    switch (shape.returnType()) {
                        case "RECTANGLE":
                            Rectangle rectangle = (Rectangle) shape;
                            g.fillRect(shape.getPositionX(), shape.getPositionY(), rectangle.getWidth(), rectangle.getHeight());
                            break;
                        case "TRIANGLE":
                            Triangle triangle = (Triangle) shape;
                            g.fillPolygon(triangle.getArrPositionX(), triangle.getArrPositionY(), 3);
                            break;
                        case "OVAL":
                            Oval oval = (Oval) shape;
                            g.fillOval(shape.getPositionX(), shape.getPositionY(), oval.getWidth(), oval.getHeight());
                            break;
                    }
                }
                g.dispose();
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(600, 600);
            }
        };

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
