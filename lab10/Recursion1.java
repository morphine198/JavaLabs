package edu.lab10;
import java.lang.*;

public class Recursion1 {
    public void recursion(int n) {
        if (n != 0) {
            recursion(n-1);
            for (int i = n; i != 0; i--) {
                System.out.printf(String.valueOf(n)+" ");
            }
        }
    }
}
