package edu.lab1;
import java.lang.*;

public class TestBall {
    public static void main(String [] args) {
        Ball b1 = new Ball("rubber", "toy");
        Ball b2 = new Ball("plastic");
        Ball b3 = new Ball("metal", "industrial");
        System.out.println(b1);
        System.out.println(b1.to_String());
        System.out.println(b2.to_String());
        System.out.println(b3.to_String());
    }
}
