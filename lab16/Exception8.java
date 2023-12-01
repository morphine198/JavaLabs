package edu.lab16;

import java.util.Scanner;

public class Exception8 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        try {
            String key = myScanner.next();
            printDetails(key);
        } catch(Exception e) {
            getKey();
        }
    }
    public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
    private String getDetails(String key) {
        if(key == "") {
            try {
                throw new Exception( "Key set to empty string" );
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return "data for " + key;
    }
}
