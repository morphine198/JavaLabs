package edu.lab4.book;

public class TesterBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setAuthor("Max Kirrilov");
        book1.setName("Zemlya");
        book1.setDay(1);
        book1.setMonth(12);
        book1.setYear(1990);
        book2.setAuthor("Viktor Haromov");
        book2.setName("Nebo");
        book2.setDay(26);
        book2.setMonth(9);
        book2.setYear(2013);

        System.out.println(book1.getAuthor());
        System.out.println(book1.getName());
        System.out.println(book1.getDay());
        System.out.println(book1.getMonth());
        System.out.println(book1.getYear());
        System.out.println(book2.getAuthor());
        System.out.println(book2.getName());
        System.out.println(book2.getDay());
        System.out.println(book2.getMonth());
        System.out.println(book2.getYear());
    }
}
