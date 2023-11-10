package edu.lab10;

public class TesterRecursion {
    public static void main(String[] args) {

        Recursion1 r1 = new Recursion1();
        Recursion2 r2 = new Recursion2();
        Recursion3 r3 = new Recursion3();
        Recursion17a r17a = new Recursion17a();
        Recursion16a r16a = new Recursion16a();

        r1.recursion(12);
        System.out.println(" ");
        r2.recursion(12);
        System.out.println(" ");
        r3.recursion(1, 12);
        System.out.println(" ");
        r3.recursion(12, 1);
        System.out.println(" ");
        System.out.println(r17a.recursion());
        System.out.println(r16a.recursion());
    }
}
