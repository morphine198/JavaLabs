package edu.lab1;
import java.lang.*;

public class Ball {
    private String material;
    private String type;
    public Ball(String m, String t) {
        material = m;
        type = t;
    }
    public Ball(String m) {
        material = m;
        type = "other";
    }
    public Ball() {
        material = "unknown";
        type = "other";
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getMaterial() {
        return material;
    }
    public String getType() {
        return type;
    }
    public String to_String() {
        return "This ball is made of "+material+" and it's "+type+" type";
    }
}
