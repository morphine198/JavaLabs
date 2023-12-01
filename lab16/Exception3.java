package edu.lab16;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            try {
                int i = Integer.parseInt(intString);
                try {
                    System.out.println( 2 / i );
                } catch (ArithmeticException e) {
                    System.out.println("Attempted division by zero");
                }
            } catch (NumberFormatException e) {
                System.out.println("Attempted division by another format");
            }
        } catch (Exception e) {
            System.out.println("Caught an Exception");
        }
    }
}
