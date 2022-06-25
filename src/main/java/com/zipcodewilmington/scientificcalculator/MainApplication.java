package com.zipcodewilmington.scientificcalculator;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication implements ActionListener {

    JFrame f;
    JTextField display;

    // operands and operators
    //
    // the calculator will operate on either one or two input numbers
    // if the user enters 2 + 3
    // it will be generalized to operandLeft operator operandRight
    //
    // some operators or functions of the calculator only need one operand and
    //      that will be stored in operandLeft
    String operandLeft = "";
    String operandRight = "";
    String operator = "";
    String units = "degrees";

    public MainApplication () {
        // Ryan will work here on GUI
        f = new JFrame("Scientific Calculator");
        display = new JTextField(20);
        display.setEditable(false); // limit interaction to button clicks

        JButton buttonEquals, buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonSin;

        buttonEquals = new JButton("=");
        buttonZero = new JButton("0");
        buttonOne = new JButton("1");
        buttonTwo = new JButton("2");
        buttonThree = new JButton("3");
        buttonFour = new JButton("4");
        buttonFive = new JButton("5");
        buttonSix = new JButton("6");
        buttonSeven = new JButton("7");
        buttonEight = new JButton("8");
        buttonNine = new JButton("9");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonSin = new JButton("sin()");

        // panel setup
        JPanel p = new JPanel();
        p.add(display);
        p.add(buttonEquals);
        p.add(buttonZero);
        p.add(buttonOne);
        p.add(buttonTwo);
        p.add(buttonThree);
        p.add(buttonFour);
        p.add(buttonFive);
        p.add(buttonSix);
        p.add(buttonSeven);
        p.add(buttonEight);
        p.add(buttonNine);
        p.add(buttonPlus);
        p.add(buttonMinus);
        p.add(buttonMultiply);
        p.add(buttonDivide);
        p.add(buttonSin);

        buttonEquals.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonSin.addActionListener(this);


        p.setBackground(new Color(186, 142, 191));
        f.add(p);
        //f.pack(); may be used instead of setSize? might want to look into layouts
        f.setSize(800, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // spawns window centered
        //f.setResizable(false);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MainApplication();
    }

    public void switchUnitsMode() {
        if (this.units.equals("degrees")) {
            this.units = "radians";
        }
        else {
            this.units = "degrees";
        }
    }

    public void switchUnitsMode(String s) {
        if (s.equals("degrees")) {
            this.units = "degrees";
        }
        else {
            this.units = "radians";
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String in = e.getActionCommand();

        // this will call methods in two files
        // based on what operator was selected on the calculator panel

        // basic functions
        if(in.charAt(0) == '=') {
            display.setText(this.units);
        }
        else if(in.charAt(0) == '2') {
            this.switchUnitsMode();
        }
        // scientific functions
        else if(in.charAt(0) == '1') {
            display.setText("spaghetti");
        }
        else if(in.charAt(0) == 's') {
            display.setText(String.valueOf(ScientificFunctions.sin(4.0, units)));
        }
    }
}
