package edu.lab13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    public void input(String name) {
        try(FileWriter writer = new FileWriter(name, false)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter text: ");
            String text = sc.nextLine();
            writer.append(text);
            writer.flush();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void output(String name) {
        try(FileReader reader = new FileReader(name)) {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void add(String name) {
        try(FileWriter writer = new FileWriter(name, true)) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter text: ");
            String text = sc.nextLine();
            writer.append(text);
            writer.flush();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
