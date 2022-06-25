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

        buttonEquals.addActionListener(theCalc);
        buttonOne.addActionListener(theCalc);
        buttonTwo.addActionListener(theCalc);
        buttonThree.addActionListener(theCalc);
        buttonFour.addActionListener(theCalc);
        buttonFive.addActionListener(theCalc);
        buttonSix.addActionListener(theCalc);
        buttonSeven.addActionListener(theCalc);
        buttonEight.addActionListener(theCalc);
        buttonNine.addActionListener(theCalc);
        buttonPlus.addActionListener(theCalc);
        buttonMinus.addActionListener(theCalc);
        buttonMultiply.addActionListener(theCalc);
        buttonDivide.addActionListener(theCalc);
        buttonSin.addActionListener(theCalc);


        p.setBackground(new Color(186, 142, 191));


        f.add(p);
        //f.pack(); may be used instead of setSize? might want to look into layouts
        f.setSize(800, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
