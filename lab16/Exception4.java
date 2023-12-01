package edu.lab16;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            try {
                System.out.println( 2 / i );
            } finally {
                System.out.println("Attempted division by zero");
            }
        } finally {
            System.out.println("Attempted division by another format");
        }
    }
}
