package edu.lab8.gui;

import javax.swing.JPanel;
import java.awt.Graphics;

public class GraphicsPanel extends JPanel {

    @Override
    public void paintComponent(Graphics object) {
        object.fillRect(50, 50, 20, 20);
    }

}
