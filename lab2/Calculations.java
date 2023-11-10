package edu.lab2;

import java.lang.*;

public class Calculations {
    public static int sum(int a, int b) {
        for (int i = a + b; i == a + b; i++) {
            return a + b;
        }
        while (b + a == a + b) {
            return a + b;
        }
        do {
            return a + b;
        } while (b + a == a + b);
    }
    public static void arguments(int length, String input) {
        for (int i = 0; i < length; i++) {
            System.out.println(input+" ");
        }
    }
    public static void harmonicSeries() {
        for (int i = 1; i < 10; i++) {
            System.out.printf(1/i+" ");
        }
    }
    public static void generateArray() {
        int[] array = new int[(int)(Math.random()*10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
            System.out.println(array[i]);
        }
        InsertionSort.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
