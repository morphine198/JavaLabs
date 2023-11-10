package edu.lab3;
import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Ivan Popov","ivapo@smth.com",'m');
        Author a2 = new Author("Anna Ivanova","anivanova@smth.com",'f');
        Author a3 = new Author("Max Komarov","mkomar@smth.com",'m');
        System.out.println(a1);
        System.out.println(a1.to_String());
        System.out.println(a2.to_String());
        System.out.println(a3.to_String());
    }
}
