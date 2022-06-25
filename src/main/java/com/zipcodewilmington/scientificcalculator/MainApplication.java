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

    // operands and operators
    //
    // the calculator will operate on either one or two input numbers
    // if the user enters 2 + 3
    // it will be generalized to operandLeft operator operandRight
    //
    // some operators or functions of the calculator only need one operand and
    //      that will be stored in operandLeft
    String operandLeft;
    String operandRight;
    String operator;

    // constructor for MainApplication
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

        p.add(buttonEquals);

        buttonEquals.addActionListener(theCalc);

        p.setBackground(new Color(186, 142, 191));


        f.add(p);
        //f.pack(); may be used instead of setsize? might want to look into layouts
        f.setSize(800, 400);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
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
