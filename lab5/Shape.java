package edu.lab5;
import java.lang.*;

public abstract class Shape {
    protected String colour;
    protected boolean filled;

    public Shape() {}
    public Shape(String c, boolean f) {
        colour = c;
        filled = f;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String to_String();
}

class Circle extends Shape {
    protected double radius;

    public Circle() {}
    public Circle(double r) {
        radius = r;
    }
    public Circle(double r, String c, boolean f) {
        radius = r;
        setColour(c);
        setFilled(f);
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    public String to_String() {
        return "The radius of this circle is "+radius;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {}
    public Rectangle(double w, double l) {
        width = w;
        length = l;
    }
    public Rectangle(double w, double l, String c, boolean f) {
        width = w;
        length = l;
        setColour(c);
        setFilled(f);
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }

    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return width+length;
    }
    public String to_String() {
        return "The width and length of this rectangle is "+width+" and "+length;
    }
}

class Square extends Rectangle {
    public Square() {}
    public Square(double s) {
        setWidth(s);
    }
    public Square(double s, String c, boolean f) {
        setWidth(s);
        setColour(c);
        setFilled(f);
    }

    public void setSide(double side) {
        setWidth(side);
    }
    public double getSide() {
        return getWidth();
    }
    //public void setWidth(double side);
    //public void setLength(double side);
    public String to_String() {
        return "The side of this square is "+getSide();
    }
}