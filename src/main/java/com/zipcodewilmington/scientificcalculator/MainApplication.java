package com.zipcodewilmington.scientificcalculator;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApplication implements ActionListener {

    JFrame f;
    JTextField display;

    // operands and operators
    //
    // the calculator will operate on either one or two input numbers
    // if the user enters 2 + 3
    // it will be generalized to operandLeft operator operand2
    //
    // some operators or functions of the calculator only need one operand and
    //      that will be stored in operandLeft
    String operand = "0";
    String operand2 = "";
    String operand3 = "";
    String operand4 = "";
    String operator = "";
    String operator2 = "";
    String operator3 = "";
    String units = "degrees";

    public MainApplication () {
        // Ryan will work here on GUI
        f = new JFrame("Scientific Calculator");
        display = new JTextField(20);
        display.setEditable(false); // limit interaction to button clicks

        JButton buttonEquals, buttonClear, buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonSin;

        buttonEquals = new JButton("=");
        buttonClear = new JButton("C");
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
        p.add(buttonClear);
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
        buttonClear.addActionListener(this);
        buttonZero.addActionListener(this);
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
        display.setText(this.operand);
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

    public String getTextField() {
        return this.display.getText();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String in = e.getActionCommand();

        // this will call methods in two files
        // based on what operator was clicked on the calculator panel

        // if you hit (a number or .)
        if ((in.charAt(0) >= '0' && in.charAt(0) <= '9') || in.charAt(0) == '.') {
            if (!operator.equals("")) {
                if (operand2.equals("")) {
                    if (in.equals(".")) {
                        operand2 = "0.0";
                    } else {
                        operand2 = in;
                    }
                    display.setText(operand2);
                } else {
                    if (operator2.equals("")) {
                        // e.g. 2 + 3
                        if (in.equals(".")) {
                            // decimal logic
                            // **
                        } else {
                            if (this.getTextField().equals("0") && in.charAt(0) > '0') {
                                operand2 = in;
                                display.setText(in);
                            } else if (!this.getTextField().equals("0")) {
                                operand2 += in;
                                display.setText(operand2);
                            }
                        }
                    } else if (operand3.equals("")) {
                        // e.g. 2 + 3 * ?
                        if (in.equals(".")) {
                            operand3 = "0.0";
                        } else {
                            operand3 = in;
                        }
                        display.setText(operand3);
                    } else {
                        // e.g. 2 + 3 * 4
                        // **
                        if (in.equals(".")) {
                            // decimal logic
                        } else {
                            if (this.getTextField().equals("0") && in.charAt(0) > '0') {
                                operand3 = in;
                                display.setText(in);
                            } else if (!this.getTextField().equals("0")) {
                                operand3 += in;
                                display.setText(operand3);
                            }
                        }
                    }
                }
            }
            // else operator is empty
            else if (in.charAt(0) == '.') {
                // decimal logic
            } else {
                if (this.getTextField().equals("0") && in.charAt(0) > '0') {
                    operand = in;
                    display.setText(in);
                } else if (!this.getTextField().equals("0")) {
                    operand += in;
                    display.setText(operand);
                }
            }
        }
        // else if you hit an operator
            // if operator takes a single number
                // call the method with whatever is on the display
                // display the result
                // clear the operator, right side, and left side?
            // else if right side is empty
                // set the operator to corresponding value
            // else (you hit a second two-sided operator with two numbers stored!)
                // if second operator is same or less in priority
                    // display the two-sided math based on what's already stored in operator
                    // set the operator to new operator input
                    // set
                // else (second operator has order priority)
                    // stores the second operator
                // ??? some third operator business!
        // else if you hit C
        else if (in.charAt(0) == 'C') { // clear selected
            operator = "";
            operator2 = "";
            operator3 = "";
            operand2 = "";
            operand3 = "";
            operand4 = "";
            operand = "0";
            display.setText(operand);
        }
        // else you the =, do some math,
        else {
            // if operator3 is loaded
            if (!operator3.equals("") && !operand4.equals("")) {
                // 2 + 3 * 4 ^ 5 =
            }
            // if operator2 is loaded
                // do operator 2 math first and then operator 1 math
            else if (!operator2.equals("") && !operand3.equals("")) {
                // 2 + 3 * 4
                // **
            }
            // else ( operator1 is loaded )
                // display two sided answer
                // reset all fields?
            else if (!operator.equals("") && !operand2.equals("")){
                // 2 + 3
            }
        }
    }
}
