package edu.lab10;
import java.util.Objects;
import java.util.Scanner;

public class Recursion16 {
    public Answer recursion() {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        Answer max = new Answer(0, 0);
        if (!Objects.equals(n, "0")) {
            max = recursion();
        }
        if (max.max < Integer.parseInt(n)) {
            max.max = Integer.parseInt(n);
            max.count = 1;
        }
        if (max.max == Integer.parseInt(n)) {
            max.count++;
        }
        return max;
    }
}
