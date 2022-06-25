package com.zipcodewilmington.scientificcalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication implements ActionListener {

    static JFrame f;
    static JTextField l;
    String operandLeft;
    String operandRight;
    String operator;

    public void calculator() {
        operandLeft = "";
        operandRight = "";
        operator = "";
    }

    public static void main(String[] args) {

        // Ryan will work here on GUI
        f = new JFrame("Scientific Calculator");
        l = new JTextField();
        l.setEditable(false); // limit interaction to button clicks

        MainApplication theCalc = new MainApplication();

        JButton buttonEquals;

        buttonEquals = new JButton("=");

        JPanel p = new JPanel();
        p.setBackground(Color.black);

        p.add(buttonEquals);

        buttonEquals.addActionListener(theCalc);

        f.add(p);
        //f.pack();
        f.setVisible(true);

        // this will call methods in two files
        // based on what operator was selected <- switch case will go here
            // basic functions
            // scientific functions

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
