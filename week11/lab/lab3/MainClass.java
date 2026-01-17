package week11.lab.lab3;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator("Casio AX-120ST");

        System.out.println("You have " + calc.getName());
        System.out.print("Enter your equation: ");
        String input = sc.nextLine().trim();

        try {
            double result = solveEquation(calc, input);
            System.out.println(input + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getClass().getName());
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }

    public static double solveEquation(Calculator calc, String input)
            throws EquationException, NonDigitException, NegativeValueException, OperatorException {

        if (input.isEmpty())
            return 0;
        ArrayList<String> tokens = tokenize(input);

        if (tokens.size() % 2 == 0) {
            throw new EquationException("Incomplete equation");
        }

        double currentVal = parseOperand(tokens.get(0));

        for (int i = 1; i < tokens.size(); i += 2) {
            String op = tokens.get(i);
            String nextOperandStr = tokens.get(i + 1);
            double nextVal = parseOperand(nextOperandStr);

            switch (op) {
                case "+":
                    currentVal = calc.add(currentVal, nextVal);
                    break;
                case "-":
                    currentVal = calc.subtract(currentVal, nextVal);
                    break;
                case "*":
                    currentVal = calc.multiply(currentVal, nextVal);
                    break;
                case "/":
                    currentVal = calc.divide(currentVal, nextVal);
                    break;
                default:
                    throw new OperatorException(calc.getName() + " dose not have the " + op + " operator");
            }
        }
        return currentVal;
    }

    private static double parseOperand(String str) throws NonDigitException, NegativeValueException {
        try {
            double val = Double.parseDouble(str);
            if (val < 0) {
                throw new NegativeValueException(str + " is a negative number");
            }
            return val;
        } catch (NumberFormatException e) {
            throw new NonDigitException(str + " contains non-digit characters");
        }
    }

    private static ArrayList<String> tokenize(String input) throws OperatorException {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder buffer = new StringBuilder();

        String operators = "+-*/";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isWhitespace(c))
                continue;

            boolean isOp = operators.indexOf(c) != -1;

            if (c == '-' && buffer.length() == 0) {
                buffer.append(c);
            } else if (isOp) {
                if (buffer.length() > 0) {
                    list.add(buffer.toString());
                    buffer.setLength(0);
                }

                list.add(String.valueOf(c));
            } else {
                if (!Character.isLetterOrDigit(c) && c != '.') {
                    throw new OperatorException("Casio AX-120ST dose not have the " + c + " operator");
                }

                buffer.append(c);
            }
        }
        if (buffer.length() > 0) {
            list.add(buffer.toString());
        }

        for (int i = 0; i < list.size() - 1; i++) {
            String s1 = list.get(i);
            String s2 = list.get(i + 1);
            if (operators.contains(s1) && operators.contains(s2)) {
                throw new OperatorException("Casio AX-120ST dose not have the " + s1 + s2 + " operator");
            }
        }

        return list;
    }
}
