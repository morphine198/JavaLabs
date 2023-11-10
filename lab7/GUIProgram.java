package edu.lab7;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class GUIProgram extends JFrame {
    int milan = 0;
    int madrid = 0;
    JLabel jlb1 = new JLabel("Result: 0 X 0");
    JLabel jlb2 = new JLabel("Last Scorer: N/A");
    JLabel jlb3 = new JLabel("Winner: DRAW");
    JButton button1 = new JButton(" AC Milan");
    JButton button2 = new JButton(" Real Madrid");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    GUIProgram() {
        super("Example");
        setLayout(null);
        setSize(270,130);
        button1.setBounds(130, 0, 125,50);
        button2.setBounds(0, 0, 125,50);
        jlb1.setBounds(0, 50, 200,18);
        jlb2.setBounds(0, 62, 200,18);
        jlb3.setBounds(0, 74, 200,18);
        add(button1);
        add(button2);
        add(jlb1);
        add(jlb2);
        add(jlb3);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    milan += 1;
                    jlb1.setText("Result: "+milan+" X "+madrid);
                    jlb2.setText("Last Scorer: AC Milan");
                    if (milan > madrid) { jlb3.setText("Winner: AC Milan"); }
                    else if (milan == madrid) { jlb3.setText("Winner: DRAW"); }
                }
                catch(Exception e)
                {
                    //JOptionPane.showMessageDialog(null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    madrid += 1;
                    jlb1.setText("Result: "+milan+" X "+madrid);
                    jlb2.setText("Last Scorer: Real Madrid");
                    if (milan < madrid) { jlb3.setText("Winner: Real Madrid"); }
                    else if (milan == madrid) { jlb3.setText("Winner: DRAW"); }
                }
                catch(Exception e)
                {
                    //JOptionPane.showMessageDialog(null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }
}
