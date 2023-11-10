package edu.lab8.gui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import edu.lab8.shapes.*;

public class GUIProgram extends JFrame {
    JFrame frame = new JFrame("TEST");
    JPanel panel = new GraphicsPanel();

    Font font = new Font("Times new roman",Font.BOLD,20);
    GUIProgram() {
        super("Example");
        setLayout(null);
        setSize(600,600);
        frame.setContentPane(panel);
        setVisible(true);
    }
}
