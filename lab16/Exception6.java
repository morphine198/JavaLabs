package edu.lab16;

public class Exception6 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
    private String getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            return "null key in getDetails";
        }
        return "data for " + key;
    }
}
