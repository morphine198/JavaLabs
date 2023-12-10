package edu.lab18;

public class Calculator {
    public static <T, U> double sum(T num1, U num2) {
        double n1 = Double.parseDouble(num1.toString());
        double n2 = Double.parseDouble(num2.toString());
        return n1 + n2;
    }

    public static <T, U> double multiply(T num1, U num2) {
        double n1 = Double.parseDouble(num1.toString());
        double n2 = Double.parseDouble(num2.toString());
        return n1 * n2;
    }

    public static <T, U> double divide(T num1, U num2) {
        double n1 = Double.parseDouble(num1.toString());
        double n2 = Double.parseDouble(num2.toString());
        return n1 / n2;
    }

    public static <T, U> double subtraction(T num1, U num2) {
        double n1 = Double.parseDouble(num1.toString());
        double n2 = Double.parseDouble(num2.toString());
        return n1 - n2;
    }
}
