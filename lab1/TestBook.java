package edu.lab1;
import java.lang.*;

public class TestBook {
    public static void main(String[] args) {
        Book bo1 = new Book("Mike William","Some book",1980);
        Book bo2 = new Book("Seaman",1724);
        Book bo3 = new Book(1815);
        System.out.println(bo1);
        System.out.println(bo1.to_String());
        bo1.countYears();
        bo2.countYears();
        bo3.countYears();
    }
}
