package edu.lab5;
import java.lang.*;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovableCircle implements Movable {
    private int radius;
    MovablePoint center;

    public MovableCircle() {}
    public MovableCircle(int x, int y, int xS, int yS, int r) {
        center = new MovablePoint(x, y, xS, yS);
        radius = r;
    }

    public String to_String() {
        return "Position is "+center.x+", "+center.y+" and speed is x: "+center.xSpeed+", y: "+center.ySpeed;
    }

    public void moveUp() {
        center.x += center.xSpeed;
    }
    public void moveDown() {
        center.x -= center.xSpeed;
    }
    public void moveLeft() {
        center.y += center.ySpeed;
    }
    public void moveRight() {
        center.y -= center.ySpeed;
    }
}

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle() {}
    public MovableRectangle(int x1, int y1, int x2, int y2, int x1S, int y1S, int x2S, int y2S) {
        topLeft = new MovablePoint(x1, y1, x1S, y1S);
        bottomRight = new MovablePoint(x2, y2, x2S, y2S);
    }

    private void synchronizeSpeedX() {
        if (topLeft.xSpeed != bottomRight.xSpeed) {
            if (topLeft.xSpeed > bottomRight.xSpeed) {
                topLeft.xSpeed -= bottomRight.xSpeed;
                bottomRight.xSpeed = topLeft.xSpeed;
            } else {
                bottomRight.xSpeed -= topLeft.xSpeed;
                topLeft.xSpeed = bottomRight.xSpeed;
            }
        }
    }
    private void synchronizeSpeedY() {
        if (topLeft.ySpeed != bottomRight.ySpeed) {
            if (topLeft.ySpeed > bottomRight.ySpeed) {
                topLeft.ySpeed -= bottomRight.ySpeed;
                bottomRight.ySpeed = topLeft.ySpeed;
            } else {
                bottomRight.ySpeed -= topLeft.ySpeed;
                topLeft.ySpeed = bottomRight.ySpeed;
            }
        }
    }
    public String to_String() {
        return "Top x: "+topLeft.x+", y: "+topLeft.y+" | Bottom x: "+bottomRight.x+", y: "+bottomRight.y+" | Speed x: "+topLeft.xSpeed+"/"+bottomRight.xSpeed+", "+topLeft.ySpeed+"/"+bottomRight.ySpeed;
    }

    public void moveUp() {
        synchronizeSpeedX();
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
    public void moveDown() {
        synchronizeSpeedX();
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }
    public void moveLeft() {
        synchronizeSpeedY();
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }
    public void moveRight() {
        synchronizeSpeedY();
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }
}

class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int X, int Y, int xS, int yS) {
        x = X;
        y = Y;
        xSpeed = xS;
        ySpeed = yS;
    }
    public String to_String() {
        return "Position is "+x+", "+y+" and speed is x:"+xSpeed+", y:"+ySpeed;
    }

    public void moveUp() {
        x += xSpeed;
    }
    public void moveDown() {
        x -= xSpeed;
    }
    public void moveLeft() {
        y += ySpeed;
    }
    public void moveRight() {
        y -= ySpeed;
    }
}