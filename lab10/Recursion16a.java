package edu.lab10;
import java.util.Scanner;

public class Recursion16a {
    public DataRecursion recursion() {
        Scanner in = new Scanner(System.in);
        byte n = in.nextByte();
        DataRecursion data = new DataRecursion();
        if (n != 0) {
            data = recursion();
        }
        if (data.max < n) {
            data.max = n;
            data.count = 1;
        } else if (data.max == n) {
            data.count++;
        }
        return data;
    }
}
