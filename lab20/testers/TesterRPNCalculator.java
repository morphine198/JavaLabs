package edu.lab20.testers;

import edu.lab20.calculator.RPNCalculator;

import javax.swing.*;

public class TesterRPNCalculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RPNCalculator calculator = new RPNCalculator();
            calculator.setVisible(true);
        });
    }
}
