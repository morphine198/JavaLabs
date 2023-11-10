package edu.lab4.book;

public class Book {
    private String author;
    private String name;
    private int year;
    private int month;
    private int day;
    public Book() {}
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
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
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
}
