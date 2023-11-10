package edu.lab10;

import java.util.Scanner;

public class Recursion17a {
    public byte recursion() {
        Scanner in = new Scanner(System.in);
        byte n = in.nextByte();
        if (n != 0) {
            byte max = recursion();
            return (byte)Math.max(max, n);
        } else { return n; }
    }
}
