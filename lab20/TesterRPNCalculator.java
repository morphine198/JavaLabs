package edu.lab20;

import javax.swing.*;

public class TesterRPNCalculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RPNCalculator calculator = new RPNCalculator();
            calculator.setVisible(true);
        });
    }
}
