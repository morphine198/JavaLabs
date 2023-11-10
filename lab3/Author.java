package edu.lab3;
import java.lang.*;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author() {}
    public Author(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    public String to_String() {
        return name+" ("+gender+") at "+email;
        //Ivan Popov(m) at ivPopov@somewhere.com
    }
}
