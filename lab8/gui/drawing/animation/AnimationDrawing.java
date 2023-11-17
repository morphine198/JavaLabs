package edu.lab8.gui.drawing.animation;

import edu.lab8.gui.drawing.image.ImageDrawing;

import javax.swing.*;
import javax.swing.plaf.IconUIResource;
import java.awt.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Properties;

public class AnimationDrawing {
    private JFrame frame;
    private JPanel panel;

    private String imgName = "Example";
    private String imgFormat = ".png";
    private int imgFrame = 1;
    private int imgFrames = 5;
    private boolean isLoading = true;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AnimationDrawing().createAndShowGui(); // Enters the 'createAndShowGui' function and never leaves it
            }
        });
    }

    public void createAndShowGui() {
        frame = new JFrame(getClass().getSimpleName());
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) { // Enters function and never leaves it
                if (imgFrame > imgFrames) { imgFrame = 1; isLoading = false; }
                super.paintComponent(g);

                if (!isLoading) {
                    try { Thread.sleep(1000); } catch (InterruptedException e) {}
                } else {
                    g.setColor(Color.BLACK);
                    g.drawString("Loading...", 0, 10);
                }

                String imagePath = System.getProperties().getProperty("user.dir")+File.separator+"img/"+imgName+imgFrame+imgFormat;
                if (Files.exists(Paths.get(imagePath))) {
                    Image img = Toolkit.getDefaultToolkit().getImage(imagePath);
                    g.drawImage(img, 0, 0, 1100, 600, this);
                } else {
                    g.setColor(Color.RED);
                    g.drawString("Image not found.", 0, 10);
                }

                imgFrame++;
                g.dispose();
                repaint();
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(1100, 600);
            }
        };
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}