package edu.lab18.testers;

import edu.lab18.*;

public class TesterGenerics {
    public static void main(String[] args) {
        // Test MyClass
        SomeClass<Integer, Cat, String> myClass = new SomeClass<>(5, new Cat(), "test");
        myClass.printClassNames();
        System.out.println("T: " + myClass.getT());
        System.out.println("V: " + myClass.getV());
        System.out.println("K: " + myClass.getK());

        // Test MinMax
        Integer[] integers = {5, 2, 9, 1, 7};
        MinMax<Integer> minMax = new MinMax<>(integers);
        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());

        // Test Calculator
        System.out.println("Sum: " + Calculator.sum(5, 3.5));
        System.out.println("Multiply: " + Calculator.multiply(2, 4.5));
        System.out.println("Divide: " + Calculator.divide(10, 2.5));
        System.out.println("Subtraction: " + Calculator.subtraction(8.7, 3));

        // Test Matrix
        Integer[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix<Integer> integerMatrix = new Matrix<>(matrix);
        integerMatrix.printMatrix();
        System.out.println("Element at row 1, column 2: " + integerMatrix.getElement(1, 2));
        integerMatrix.setElement(0, 0, 10);
        integerMatrix.printMatrix();
    }
}
