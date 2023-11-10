package edu.lab5;
import java.lang.*;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovableCircle(0, 0, 1, 1, 5);
        Movable m2 = new MovableRectangle(17, 87, 16, 86, 1, 3, 8, 9);
        //MovableCircle c1 = (MovableCircle)m1;
        System.out.println(((MovableCircle)m1).to_String());
        System.out.println(((MovableRectangle)m2).to_String());
        m1.moveDown();
        m1.moveLeft();
        m2.moveUp();
        m2.moveRight();
        System.out.println(((MovableCircle)m1).to_String());
        System.out.println(((MovableRectangle)m2).to_String());
    }
}
