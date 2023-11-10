package edu.lab10;

public class Recursion2 {
    public void recursion(int n) {
        if (n != 0) {
            recursion(n-1);
            System.out.printf(String.valueOf(n)+" ");
        }
    }
}
