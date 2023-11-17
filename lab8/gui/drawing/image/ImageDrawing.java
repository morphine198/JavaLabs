package edu.lab8.gui.drawing.image;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.nio.file.*;

public class ImageDrawing {
    private JFrame frame;
    private JPanel panel;
    private String imageName = "Example.png";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ImageDrawing().createAndShowGui();
            }
        });
    }

    public void createAndShowGui() {
        frame = new JFrame(getClass().getSimpleName());
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                String imagePath = System.getProperties().getProperty("user.dir") + File.separator+ "img/" + imageName;
                Path imgPath = Paths.get(imagePath);
                if (Files.exists(imgPath)) {
                    Image img = Toolkit.getDefaultToolkit().getImage(imagePath);
                    g.drawImage(img, 0, 0, 1100, 600, this);
                    g.setColor(Color.WHITE);
                    g.drawString(imageName, 0, 10);
                } else {
                    g.drawString("Image not found.", 0, 10);
                }

                g.dispose();
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
