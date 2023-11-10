package edu.lab10;

public class Recursion17 {
    public long recursion(long n) {
        long temp = n%10;
        long max = 0;
        if (n - temp > 9) { max = recursion((n-temp)/10); }
        else { max = n - temp; }
        return Math.max(temp, max);
    }
}
