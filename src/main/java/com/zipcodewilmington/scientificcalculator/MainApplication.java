package com.zipcodewilmington.scientificcalculator;
import com.sun.tools.javac.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApplication implements ActionListener {

    JFrame f;
    JTextField display;
    JButton buttonDecimal, buttonEquals, buttonClear, buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour,
            buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonPlus, buttonMinus, buttonMultiply,
            buttonDivide, buttonSin, buttonRad, buttonCos, buttonTan, buttonASin, buttonACos, buttonATan,
            buttonFactorial, buttonLog, buttonILog, buttonLogN, buttonILogN;

    // operands and operators
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
        display = new JTextField(18);
        display.setEditable(false); // limit interaction to button clicks

        buttonDecimal = new JButton(".");
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
        buttonCos = new JButton("cos()");
        buttonTan = new JButton("tan()");
        buttonRad = new JButton("Rad");
        buttonASin = new JButton("asin()");
        buttonACos = new JButton("acos()");
        buttonATan = new JButton("atan()");
        buttonFactorial = new JButton("!");
        buttonLog = new JButton("log");
        buttonILog = new JButton("ilog");
        buttonLogN = new JButton("ln");
        buttonILogN = new JButton("iln");

        // panel setup
        JPanel p = new JPanel();
        p.add(display);
        p.add(buttonClear);

        p.add(buttonSeven);
        p.add(buttonEight);
        p.add(buttonNine);
        p.add(buttonDivide);

        p.add(buttonFour);
        p.add(buttonFive);
        p.add(buttonSix);
        p.add(buttonMultiply);

        p.add(buttonOne);
        p.add(buttonTwo);
        p.add(buttonThree);
        p.add(buttonMinus);

        p.add(buttonZero);
        p.add(buttonDecimal);
        p.add(buttonEquals);
        p.add(buttonPlus);

        p.add(buttonSin);
        p.add(buttonCos);
        p.add(buttonTan);
        p.add(buttonRad);

        p.add(buttonASin);
        p.add(buttonACos);
        p.add(buttonATan);
        p.add(buttonFactorial);

        p.add(buttonLog);
        p.add(buttonILog);
        p.add(buttonLogN);
        p.add(buttonILogN);

        // listening to button clicks
        buttonDecimal.addActionListener(this);
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
        buttonRad.addActionListener(this);
        buttonSin.addActionListener(this);
        buttonCos.addActionListener(this);
        buttonTan.addActionListener(this);
        buttonASin.addActionListener(this);
        buttonACos.addActionListener(this);
        buttonATan.addActionListener(this);
        buttonFactorial.addActionListener(this);
        buttonLog.addActionListener(this);
        buttonLogN.addActionListener(this);
        buttonILog.addActionListener(this);
        buttonILogN.addActionListener(this);

        p.setBackground(new Color(186, 142, 191));
        f.add(p);
        //f.pack(); may be used instead of setSize? might want to look into layouts
        f.setSize(350, 400);
        display.setText(operand);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // spawns window centered
        f.setResizable(false);
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

    public void setDisplayAndClearMemory(String newDisplayValue) {
        this.operand = newDisplayValue;
        this.display.setText(this.operand);
        this.operand2 = "";
        this.operand3 = "";
        this.operand4 = "";
        this.operator = "";
        this.operator2 = "";
        this.operator3 = "";
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
                            if (!operand2.contains(".")) {
                                operand2 += ".";
                                display.setText(operand);
                            }
                        } else {
                            if (this.getTextField().equals("0") && in.charAt(0) > '0') {
                                operand2 = in;
                            } else if (!this.getTextField().equals("0")) {
                                operand2 += in;
                            }
                            display.setText(operand2);
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
                            if (!operand3.contains(".")) {
                                operand3 += ".";
                                display.setText(operand);
                            }
                        } else {
                            if (this.getTextField().equals("0") && in.charAt(0) > '0') {
                                operand3 = in;
                            } else if (!this.getTextField().equals("0")) {
                                operand3 += in;
                            }
                            display.setText(operand3);
                        }
                    }
                }
            }
            // else operator is empty
            else if (in.charAt(0) == '.') {
                // decimal logic
                if (!operand.contains(".")) {
                    operand += ".";
                    display.setText(operand);
                }
            } else {
                if (this.getTextField().equals("0") && in.charAt(0) > '0') {
                    operand = in;
                } else if (!this.getTextField().equals("0")) {
                    operand += in;
                }
                display.setText(operand);
            }
        }
        // else if you hit Rad/Deg toggle
        else if (in.equals("Rad") || in.equals("Deg")) {
            this.switchUnitsMode();
            if (buttonRad.getText().equals("Rad")) {
                buttonRad.setText("Deg");
            }
            else {
                buttonRad.setText("Rad");
            }
        }
        // else if you hit the =, do some math,
        else if (in.charAt(0) == '=') {
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
        // else if you hit C
        else if (in.charAt(0) == 'C') { // clear selected
            setDisplayAndClearMemory("0");
        }
        // else if you hit an operator
        else {
            // if operator takes a single number
                // call the method with whatever is on the display
                // display the result
                // clear everything, set operand to
            if (in.charAt(0) == 's' || in.charAt(0) == 'c' || in.charAt(0) == 't' || in.charAt(0) == 'a'
                || in.charAt(0) == 'i' || in.charAt(0) == 'l') {
                double d = switch (in) {
                    case "sin()" -> ScientificFunctions.sin(Double.parseDouble(display.getText()), units);
                    case "cos()" -> ScientificFunctions.cos(Double.parseDouble(display.getText()), units);
                    case "tan()" -> ScientificFunctions.tan(Double.parseDouble(display.getText()), units);
                    case "asin()" -> ScientificFunctions.asin(Double.parseDouble(display.getText()), units);
                    case "acos()" -> ScientificFunctions.acos(Double.parseDouble(display.getText()), units);
                    case "atan()" -> ScientificFunctions.atan(Double.parseDouble(display.getText()), units);
                    case "log" -> ScientificFunctions.log(Double.parseDouble(display.getText()));
                    case "ilog" -> ScientificFunctions.inverseLog(Double.parseDouble(display.getText()));
                    case "ln" -> ScientificFunctions.naturalLog(Double.parseDouble(display.getText()));
                    case "iln" -> ScientificFunctions.inverseNaturalLog(Double.parseDouble(display.getText()));
                    default -> 0.0;
                };
                display.setText(Double.toString(d));
                setDisplayAndClearMemory(display.getText());
            }
            else if (in.charAt(0) == '!') {
                long l = ScientificFunctions.factorial(Integer.parseInt(display.getText()));
                display.setText(Long.toString(l));
                setDisplayAndClearMemory(display.getText());
            }
            // else if operand2 is empty
                // set the operator to corresponding value
                // e.g. 2 ?
            else if (operand2.equals("")) {
                operator = in;
            }
            // else (you hit a second two-sided operator with two numbers stored!)
                // if second operator is same or less in priority
                    // display the two-sided math based on what's already stored in operator
                        // set the operator to new operator input// set
                // else (second operator has order priority)
                    // stores the second operator
                // ??? some third operator business!
        }
    }
}
