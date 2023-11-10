package edu.lab10;

public class Recursion3 {
    public void recursion(int a, int b) {
        System.out.printf(String.valueOf(a)+" ");
        if (a != b) {
            if (a < b) { recursion(a+1, b); }
            else { recursion(a-1, b); }
        }
    }
}
