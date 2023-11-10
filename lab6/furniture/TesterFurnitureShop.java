package edu.lab6.furniture;

public class TesterFurnitureShop {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop("Here", 3);
        shop.addFurniture("chair", "Chairlinsky", "Wood");
        shop.addFurniture("chair", "Chairbynsky", "Metal");
        shop.addFurniture("bed", "The Great Bed", "Metal");
        shop.printFurniture();
        shop.sellFurniture("chair", "Chairbynsky", "Metal");
        System.out.println();
        shop.printFurniture();
        System.out.println("Revenue "+shop.getRevenue());
    }
}
