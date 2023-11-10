package edu.lab6.dog;

public class TesterDogs {
    public static void main(String[] args) {
        Dogs pitbull = new Pitbull("Princess", 3, true);
        Dogs chihuahua = new Chihuahua("Frog", 7, false);
        pitbull.displayInformation();
        chihuahua.displayInformation();
    }
}
