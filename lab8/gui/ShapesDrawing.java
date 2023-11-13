package edu.lab8.gui;

import java.awt.Dimension;
import java.awt.Graphics;

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
                super.paintComponent(g); //ALWAYS call this method first!
                for (int i = 0; i < 3; i++) {
                    int randomShape = (int)(Math.random() * 3);
                    int randomX = (int)(Math.random() * 500);
                    int randomY = (int)(Math.random() * 500);
                    switch (randomShape) {
                        case 0:
                            g.drawRect(randomX, randomY, 50, 50); //Draws square
                            break;
                        case 1:
                            g.drawRect(randomX, randomY, 100, 50); //Draws rectangle
                            break;
                        case 2:
                            g.drawPolygon(new int[] {35, 10, 60}, new int[] {150, 200, 200}, 3); //Draws triangle
                            break;
                        default:
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
