package edu.lab8.gui;

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
                    int randomShape = (int)(Math.random() * 3);
                    int randomColor = (int)(Math.random() * 3);
                    int[] randomX = new int[3];
                    int[] randomY = new int[3];
                    randomX[0] = (int)(Math.random() * 500);
                    randomY[0] = (int)(Math.random() * 500);
                    switch (randomColor) {
                        case 0:
                            g.setColor(Color.RED);
                            break;
                        case 1:
                            g.setColor(Color.GREEN);
                            break;
                        case 2:
                            g.setColor(Color.BLUE);
                            break;
                    }
                    switch (randomShape) {
                        case 0:
                            g.fillRect(randomX[0], randomY[0], 50, 50);
                            break;
                        case 1:
                            for (int points = 1; points < 3; points++) {
                                randomX[points] = (int)(Math.random() * 500);
                                randomY[points] = (int)(Math.random() * 500);
                            }
                            g.fillPolygon(randomX, randomY, 3);
                            break;
                        case 2:
                            g.fillOval(randomX[0], randomY[0], 50, 50);
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
