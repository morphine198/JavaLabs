package edu.lab1;
import java.lang.*;

public class Book {
    private String author;
    private String name;
    private int year;
    public Book(String a, String n, int y) {
        author = a;
        name = n;
        year = y;
    }
    public Book(String n, int y) {
        author = "Unknown";
        name = n;
        year = y;
    }
    public Book(int y) {
        author = "Unknown";
        name = "UNKNOWN";
        year = y;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public String to_String() {
        return author+"'s book '"+name+"' created in "+year;
    }
    public void countYears() {
        System.out.println(author+"'s book '"+name+"' is "+(2023-year)+" years old!");
    }
}
