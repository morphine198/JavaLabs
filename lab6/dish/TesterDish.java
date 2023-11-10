package edu.lab6.dish;

public class TesterDish {
    public static void main(String[] args) {
        Dish cup = new Cup("Cup", "Glass", false);
        Dish plate = new Plate("Dinner plate", "Marble", 10.75);
        cup.displayInformation();
        plate.displayInformation();
    }
}
