package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class BasicFunctions {
    // Tristan will write methods for basic calculator functions
    // e.g. + - / *

    public static void prompt(){System.out.println("Enter a number");}
    public static int parse(String y) {int b = Integer.parseInt(y);
        return b;}

                public static void main (String[]args){
                Scanner scan = new Scanner(System.in);

                System.out.println("Addition, Subtraction, Multiplication, Division?");
                String input = scan.nextLine();

                    switch (input) {
                        case "Addition" -> {
                            prompt();
                            String num1 = scan.nextLine();
                            prompt();
                            String num2 = scan.nextLine();
                            System.out.println(parse(num1) + parse(num2));
                            break;
                        }
                        case "Subtraction" -> {
                            prompt();
                            String num1 = scan.nextLine();
                            prompt();
                            String num2 = scan.nextLine();
                            System.out.println(parse(num1) - parse(num2));
                            break;
                        }
                        case "Multiplication" -> {
                            prompt();
                            String num1 = scan.nextLine();
                            prompt();
                            String num2 = scan.nextLine();
                            System.out.println(parse(num1) * parse(num2));
                            break;
                        }
                        case "Division" -> {
                            prompt();
                            String num1 = scan.nextLine();
                            prompt();
                            String num2 = scan.nextLine();
                            System.out.println(parse(num1) / parse(num2));
                            break;
                        }
                    }



            }


            }
