package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApplication implements ActionListener {

    JFrame f;
    JTextField display;
    JPanel p;
    JButton buttonDecimal, buttonEquals, buttonClear, buttonZero, buttonOne, buttonTwo, buttonThree, buttonFour,
            buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonPlus, buttonMinus, buttonMultiply,
            buttonDivide, buttonSin, buttonRad, buttonCos, buttonTan, buttonASin, buttonACos, buttonATan,
            buttonFactorial, buttonLog, buttonILog, buttonLogN, buttonILogN, buttonInvertSign, buttonSqrt,
            buttonYellow, buttonMint, buttonSkyBlue, buttonLavender, buttonPow, buttonInverse, buttonSquare,
            buttonMemoryAdd, buttonMemoryClear, buttonMemorySubtract, buttonMemoryRetrieve;

    Color gray = new Color(60,60,60);
    Color softYellow = new Color(232, 212, 142);
    Color skyBlue = new Color(183, 208, 237);
    Color lavender = new Color(186, 142, 191);
    Color mint = new Color(180, 222, 186);

    // operands and operators
    String operand = "0";
    String operand2 = "";
    String operand3 = "";
    String operand4 = "";
    String operator = "";
    String operator2 = "";
    String operator3 = "";
    String memory = "";
    String units = "degrees";
    public static void main(String[] args) {
        new MainApplication();
    }

    public MainApplication () {
        // Ryan will work here on GUI
        f = new JFrame("Scientific Calculator");
        p = new JPanel();
        display = new JTextField();
        display.setEditable(false); // limit interaction to button clicks

        Border calcBorder = BorderFactory.createLineBorder(gray, 1);

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
        buttonSquare = new JButton("x^2");
        buttonPow = new JButton("^");
        buttonLog = new JButton("log");
        buttonILog = new JButton("ilog");
        buttonLogN = new JButton("ln");
        buttonILogN = new JButton("iln");
        buttonInvertSign = new JButton("+/-");
        buttonInverse = new JButton("inv");
        buttonSqrt = new JButton("sqrt");
        buttonYellow = new JButton("YE");
        buttonMint = new JButton("MI");
        buttonSkyBlue = new JButton("SK");
        buttonLavender = new JButton("LA");
        buttonMemoryAdd = new JButton("m+");
        buttonMemoryClear = new JButton("mc");
        buttonMemoryRetrieve = new JButton("mr");
        buttonMemorySubtract = new JButton("m-");

        // here
        GridBagLayout gbl = new GridBagLayout();
        p.setLayout(gbl);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.weighty = 1;
        c.gridwidth = 4;
        c.gridx = 0;
        c.gridy = 0;
        gbl.setConstraints(display, c);
        p.add(display);

        c.gridwidth = 1;
        c.gridy = 1;
        gbl.setConstraints(buttonPlus, c);
        p.add(buttonPlus);
        c.gridx = 1;
        gbl.setConstraints(buttonSeven, c);
        p.add(buttonSeven);
        c.gridx = 2;
        gbl.setConstraints(buttonEight, c);
        p.add(buttonEight);
        c.gridx = 3;
        gbl.setConstraints(buttonNine, c);
        p.add(buttonNine);

        c.gridy = 2;
        c.gridx = 0;
        gbl.setConstraints(buttonDivide, c);
        p.add(buttonDivide);
        c.gridx = 1;
        gbl.setConstraints(buttonFour, c);
        p.add(buttonFour);
        c.gridx = 2;
        gbl.setConstraints(buttonFive, c);
        p.add(buttonFive);
        c.gridx = 3;
        gbl.setConstraints(buttonSix, c);
        p.add(buttonSix);

        c.gridy = 3;
        c.gridx = 0;
        gbl.setConstraints(buttonMultiply, c);
        p.add(buttonMultiply);
        c.gridx = 1;
        gbl.setConstraints(buttonOne, c);
        p.add(buttonOne);
        c.gridx = 2;
        gbl.setConstraints(buttonTwo, c);
        p.add(buttonTwo);
        c.gridx = 3;
        gbl.setConstraints(buttonThree, c);
        p.add(buttonThree);

        c.gridy = 4;
        c.gridx = 0;
        gbl.setConstraints(buttonMinus, c);
        p.add(buttonMinus);
        c.gridx = 1;
        gbl.setConstraints(buttonZero, c);
        p.add(buttonZero);
        c.gridx = 2;
        gbl.setConstraints(buttonDecimal, c);
        p.add(buttonDecimal);
        c.gridx = 3;
        gbl.setConstraints(buttonEquals, c);
        p.add(buttonEquals);

        c.gridy = 5;
        c.gridx = 0;
        gbl.setConstraints(buttonClear, c);
        p.add(buttonClear);
        c.gridx = 1;
        gbl.setConstraints(buttonSin, c);
        p.add(buttonSin);
        c.gridx = 2;
        gbl.setConstraints(buttonCos, c);
        p.add(buttonCos);
        c.gridx = 3;
        gbl.setConstraints(buttonTan, c);
        p.add(buttonTan);

        c.gridy = 6;
        c.gridx = 0;
        gbl.setConstraints(buttonRad, c);
        p.add(buttonRad);
        c.gridx = 1;
        gbl.setConstraints(buttonASin, c);
        p.add(buttonASin);
        c.gridx = 2;
        gbl.setConstraints(buttonACos, c);
        p.add(buttonACos);
        c.gridx = 3;
        gbl.setConstraints(buttonATan, c);
        p.add(buttonATan);

        c.gridy = 7;
        c.gridx = 0;
        gbl.setConstraints(buttonPow, c);
        p.add(buttonPow);
        c.gridx = 1;
        gbl.setConstraints(buttonSqrt, c);
        p.add(buttonSqrt);
        c.gridx = 2;
        gbl.setConstraints(buttonInvertSign, c);
        p.add(buttonInvertSign);
        c.gridx = 3;
        gbl.setConstraints(buttonFactorial, c);
        p.add(buttonFactorial);

        c.gridy = 8;
        c.gridx = 0;
        gbl.setConstraints(buttonLog, c);
        p.add(buttonLog);
        c.gridx = 1;
        gbl.setConstraints(buttonILog, c);
        p.add(buttonILog);
        c.gridx = 2;
        gbl.setConstraints(buttonLogN, c);
        p.add(buttonLogN);
        c.gridx = 3;
        gbl.setConstraints(buttonILogN, c);
        p.add(buttonILogN);

        c.gridy = 9;
        c.gridx = 0;
        c.gridwidth = 2;
        gbl.setConstraints(buttonInverse, c);
        p.add(buttonInverse);
        c.gridx = 2;
        gbl.setConstraints(buttonSquare, c);
        p.add(buttonSquare);

        c.gridy = 10;
        c.gridx = 0;
        c.gridwidth = 1;
        gbl.setConstraints(buttonMemoryAdd, c);
        p.add(buttonMemoryAdd);
        c.gridx = 1;
        gbl.setConstraints(buttonMemorySubtract, c);
        p.add(buttonMemorySubtract);
        c.gridx = 2;
        gbl.setConstraints(buttonMemoryClear, c);
        p.add(buttonMemoryClear);
        c.gridx = 3;
        gbl.setConstraints(buttonMemoryRetrieve, c);
        p.add(buttonMemoryRetrieve);

        c.gridy = 11;
        c.gridx = 0;
        gbl.setConstraints(buttonYellow, c);
        p.add(buttonYellow);
        c.gridx = 1;
        gbl.setConstraints(buttonMint, c);
        p.add(buttonMint);
        c.gridx = 2;
        gbl.setConstraints(buttonSkyBlue, c);
        p.add(buttonSkyBlue);
        c.gridx = 3;
        gbl.setConstraints(buttonLavender, c);
        p.add(buttonLavender);

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
        buttonPow.addActionListener(this);
        buttonLog.addActionListener(this);
        buttonLogN.addActionListener(this);
        buttonILog.addActionListener(this);
        buttonILogN.addActionListener(this);
        buttonInvertSign.addActionListener(this);
        buttonInverse.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonYellow.addActionListener(this);
        buttonMint.addActionListener(this);
        buttonSkyBlue.addActionListener(this);
        buttonLavender.addActionListener(this);
        buttonMemorySubtract.addActionListener(this);
        buttonMemoryAdd.addActionListener(this);
        buttonMemoryRetrieve.addActionListener(this);
        buttonMemoryClear.addActionListener(this);

        buttonDecimal.setBorder(calcBorder);
        buttonEquals.setBorder(calcBorder);
        buttonClear.setBorder(calcBorder);
        buttonZero.setBorder(calcBorder);
        buttonOne.setBorder(calcBorder);
        buttonTwo.setBorder(calcBorder);
        buttonThree.setBorder(calcBorder);
        buttonFour.setBorder(calcBorder);
        buttonFive.setBorder(calcBorder);
        buttonSix.setBorder(calcBorder);
        buttonSeven.setBorder(calcBorder);
        buttonEight.setBorder(calcBorder);
        buttonNine.setBorder(calcBorder);
        buttonPlus.setBorder(calcBorder);
        buttonMinus.setBorder(calcBorder);
        buttonMultiply.setBorder(calcBorder);
        buttonDivide.setBorder(calcBorder);
        buttonRad.setBorder(calcBorder);
        buttonSin.setBorder(calcBorder);
        buttonCos.setBorder(calcBorder);
        buttonTan.setBorder(calcBorder);
        buttonASin.setBorder(calcBorder);
        buttonACos.setBorder(calcBorder);
        buttonATan.setBorder(calcBorder);
        buttonFactorial.setBorder(calcBorder);
        buttonPow.setBorder(calcBorder);
        buttonLog.setBorder(calcBorder);
        buttonLogN.setBorder(calcBorder);
        buttonILog.setBorder(calcBorder);
        buttonILogN.setBorder(calcBorder);
        buttonInvertSign.setBorder(calcBorder);
        buttonInverse.setBorder(calcBorder);
        buttonSqrt.setBorder(calcBorder);
        buttonYellow.setBorder(calcBorder);
        buttonMint.setBorder(calcBorder);
        buttonSkyBlue.setBorder(calcBorder);
        buttonLavender.setBorder(calcBorder);
        buttonSquare.setBorder(calcBorder);
        buttonMemoryAdd.setBorder(calcBorder);
        buttonMemoryRetrieve.setBorder(calcBorder);
        buttonMemoryClear.setBorder(calcBorder);
        buttonMemorySubtract.setBorder(calcBorder);

        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e) {
            e.printStackTrace();
        }

        buttonYellow.setOpaque(true);
        buttonYellow.setBackground(softYellow);
        buttonYellow.setForeground(softYellow);
        buttonMint.setOpaque(true);
        buttonMint.setBackground(mint);
        buttonMint.setForeground(mint);
        buttonSkyBlue.setOpaque(true);
        buttonSkyBlue.setBackground(skyBlue);
        buttonSkyBlue.setForeground(skyBlue);
        buttonLavender.setOpaque(true);
        buttonLavender.setBackground(lavender);
        buttonLavender.setForeground(lavender);

        p.setBackground(lavender);
        f.add(p);
        //f.pack(); // may be used instead of setSize? might want to look into layouts
        f.setSize(450, 500);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setText(operand);
        Font displayFont = new Font("SansSerif", Font.BOLD, 24);
        display.setFont(displayFont);
        display.setForeground(Color.darkGray);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null); // spawns window centered
        f.setResizable(false);
        f.setVisible(true);
    }

    public void switchUnitsMode() {
        if (units.equals("degrees")) {
            units = "radians";
        }
        else {
            units = "degrees";
        }
    }

    public void switchUnitsMode(String s) {
        if (s.equals("degrees")) {
            units = "degrees";
        }
        else {
            units = "radians";
        }
    }

    public String getTextField() {
        return display.getText();
    }

    public void setDisplayAndClearMemory(String newDisplayValue) {
        operand = newDisplayValue;
        display.setText(operand);
        operand2 = "";
        operand3 = "";
        operand4 = "";
        operator = "";
        operator2 = "";
        operator3 = "";
    }

    public String twoSidedMath(String leftSide, String operator, String rightSide) {
        if (leftSide.equals("Error") || rightSide.equals("Error") || leftSide.equals("Infinity") || rightSide.equals("Infinity")) {
            return "Error";
        }
        double x = Double.parseDouble(leftSide);
        double y = Double.parseDouble(rightSide);

        return switch (operator) {
            case "+" -> BasicFunctions.add(x, y);
            case "-" -> BasicFunctions.subtract(x, y);
            case "*" -> BasicFunctions.multiply(x, y);
            case "/" -> BasicFunctions.divide(x, y);
            case "^" -> BasicFunctions.pow(x, y);
            default -> "0.00";
        };
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String in = e.getActionCommand();

        // methods called in two files based on what operator was clicked on the calculator panel
            // BasicFunctions.java
            // ScientificFunctions.java

        ///////////////////////
        ///////////////////////
        // NUMBERS AND DECIMAL
        ///////////////////////
        ///////////////////////
        if ((in.charAt(0) >= '0' && in.charAt(0) <= '9') || in.equals(".")) {
            // screen says Error?
            if (display.getText().equals("Error") || display.getText().equals("Infinity")) {
                if (in.equals(".")) {
                    operand = "0.0";
                } else {
                    operand = in;
                }
            }
            else if (!operator.equals("")) {
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
                                display.setText(operand2);
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
                        if (operator3.equals("")) {
                            // e.g. 2 + 3 * 4
                            // **
                            if (in.equals(".")) {
                                // decimal logic
                                if (!operand3.contains(".")) {
                                    operand3 += ".";
                                    display.setText(operand3);
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
                        else {
                            if (in.equals(".")) {
                                // decimal logic
                                if (!operand4.contains(".")) {
                                    operand4 += ".";
                                    display.setText(operand4);
                                }
                            } else {
                                if (this.getTextField().equals("0") && in.charAt(0) > '0') {
                                    operand4 = in;
                                } else if (!this.getTextField().equals("0")) {
                                    operand4 += in;
                                }
                                display.setText(operand4);
                            }
                        }
                    }
                }
            }
            // else operator is empty
            else if (in.equals(".")) {
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
        /////////////////////////
        /////////////////////////
        // RADIAN / DEGREE TOGGLE
        /////////////////////////
        /////////////////////////
        else if (in.equals("Rad") || in.equals("Deg")) {
            this.switchUnitsMode();
            if (buttonRad.getText().equals("Rad")) {
                buttonRad.setText("Deg");
            }
            else {
                buttonRad.setText("Rad");
            }
        }
        /////////////////////////
        /////////////////////////
        // INVERT SIGN TOGGLE
        /////////////////////////
        /////////////////////////
        else if (in.equals("+/-")) {
            if  (!display.getText().equals("Error") && !display.getText().equals("Infinity")) {
                if (!operand4.equals("")) {
                    operand4 = BasicFunctions.invertSign(Double.parseDouble(operand4));
                    display.setText(operand4);
                } else if (!operand3.equals("")) {
                    operand3 = BasicFunctions.invertSign(Double.parseDouble(operand3));
                    display.setText(operand3);
                } else if (!operand2.equals("")) {
                    operand2 = BasicFunctions.invertSign(Double.parseDouble(operand2));
                    display.setText(operand2);
                } else {
                    operand = BasicFunctions.invertSign(Double.parseDouble(operand));
                    display.setText(operand);
                }
            }
        }
        /////////////////////////
        /////////////////////////
        // EQUALS SIGN
        /////////////////////////
        /////////////////////////
        else if (in.equals("=")) {
            if  (!display.getText().equals("Error") && !display.getText().equals("Infinity")) {
                // if operator3 is loaded
                if (!operator3.equals("") && !operand4.equals("")) {
                    // 2 + 3 * 4 ^ 5 =
                    setDisplayAndClearMemory(twoSidedMath(operand, operator, twoSidedMath(operand2, operator2, twoSidedMath(operand3, operator3, operand4))));
                }
                // if operator2 is loaded
                // do operator 2 math first and then operator 1 math
                else if (!operator2.equals("") && !operand3.equals("")) {
                    // 2 + 3 * 4 =
                    setDisplayAndClearMemory(twoSidedMath(operand, operator, twoSidedMath(operand2, operator2, operand3)));
                }
                // else ( operator1 is loaded )
                // display two-sided answer
                // reset all fields?
                else if (!operator.equals("") && !operand2.equals("")) {
                    // 2 + 3 =
                    setDisplayAndClearMemory(twoSidedMath(operand, operator, operand2));
                }
            }
        }
        /////////////////////////
        /////////////////////////
        // CLEAR SIGN
        /////////////////////////
        /////////////////////////
        else if (in.equals("C")) { // clear selected
            setDisplayAndClearMemory("0");
        }
        /////////////////////////
        /////////////////////////
        // COLORS
        /////////////////////////
        /////////////////////////
        else if (in.equals("YE") || in.equals("LA") || in.equals("MI") || in.equals("SK")) {
            switch (in) {
                case "YE" -> p.setBackground(softYellow);
                case "LA" -> p.setBackground(lavender);
                case "MI" -> p.setBackground(mint);
                case "SK" -> p.setBackground(skyBlue);
            }
        }
        /////////////////////////
        /////////////////////////
        // ALL OPERATORS
        /////////////////////////
        /////////////////////////
        else {
            if  (!display.getText().equals("Error") && !display.getText().equals("Infinity")) {
                // if operator takes just 1 double
                // call the method with whatever is on the display
                // display the result
                // clear everything, set operand to
                if (in.equals("sin()") || in.equals("cos()") || in.equals("tan()") || in.charAt(0) == 'a'
                        || in.charAt(0) == 'i' || in.charAt(0) == 'l' || in.equals("sqrt") || in.equals("x^2")) {
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
                        case "sqrt" -> BasicFunctions.sqrt(Double.parseDouble(display.getText()));
                        case "inv" -> BasicFunctions.inverse(Double.parseDouble(display.getText()));
                        case "x^2" -> BasicFunctions.square(Double.parseDouble(display.getText()));
                        default -> 0.00;
                    };
                    display.setText(Double.toString(d));
                    setDisplayAndClearMemory(display.getText());
                } else if (in.equals("!")) {
                    try {
                        long l = ScientificFunctions.factorial(Integer.parseInt(display.getText()));
                        display.setText(Long.toString(l));
                        setDisplayAndClearMemory(display.getText());
                    } catch (Exception err) {
                        setDisplayAndClearMemory("Error");
                    }

                }
                // else if operand2 is empty
                // set the operator to corresponding value
                // e.g. 2 ?
                else if (operand2.equals("")) {
                    operator = in;
                }
                // else (you hit a second two-sided operator with two numbers stored!)
                else if (operand3.equals("")) {
                    // 2 + 3 ?
                    // if second operator is same or less in priority
                    // display the two-sided math based on what's already stored in operator
                    // set operator to input
                    // set operand to what's on display
                    // clear the operator2 and operand2
                    // 2 + 3 * 5
                    // 2 + 3 ^ 5
                    if ((operator2.equals("^")) ||
                            (((operator2.equals("*")) || (operator2.equals("/"))) && ((!operator.equals("+")) && (!operator.equals("-")))) ||
                            ((operator2.equals("+")) || (operator2.equals("-")))
                    ) {
                        display.setText(twoSidedMath(operand, operator, operand2));
                        operand = display.getText();
                        operator = in;
                        operand2 = "";
                        operator2 = "";
                    }
                    // else (second operator has order priority)
                    // stores the second operator
                    else {
                        operator2 = in;
                    }
                } else { // 2 + 3 * 4 ?
                    if (in.equals("^")) {
                        operator3 = in;
                    } else {
                        if (in.equals("*") || in.equals("/")) {
                            // 2 + 3 * 4 *
                            operand2 = twoSidedMath(operand2, operator2, operand3);
                            operator2 = in;
                            display.setText(operand2);
                            operand3 = "";
                        } else {
                            // 2 + 3 * 4 +
                            operand = twoSidedMath(operand, operator, twoSidedMath(operand2, operator2, operand3));
                            operator = in;
                            display.setText(operand);
                            operand2 = "";
                            operand3 = "";
                            operator2 = "";
                        }
                    }
                }
            }
        }
    }
}
