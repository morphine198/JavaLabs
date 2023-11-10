package edu.lab3;
import java.lang.*;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(5.77, 9.43);
        Ball b2 = new Ball(0.01, -0.01);
        Ball b3 = new Ball(-165.97, 57.12);
        System.out.println(b1);
        for (int i = 0; i < 2; i++) {
            System.out.println(b1.to_String());
            System.out.println(b2.to_String());
            System.out.println(b3.to_String());
            b1.move(8.97, -10.43);
            b2.move(-18.66, 10.01);
            b3.move(1.41, 60.90);
            System.out.println(" ");
        }

    }
}
