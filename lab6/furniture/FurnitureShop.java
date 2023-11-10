package edu.lab6.furniture;

import java.util.*;

public class FurnitureShop {
    private String location;
    private int revenue;
    private int furnitureCount;
    private Furniture[] furniture;
    public FurnitureShop(String location, int furnitureCount) {
        this.location = location;
        this.furnitureCount = furnitureCount;
        furniture = new Furniture[furnitureCount];
        revenue = 0;
    }
    public int getRevenue() {
        return revenue;
    }
    public void printFurniture() {
        for (int i = 0; i < furnitureCount; i++) {
            if (!Objects.equals(furniture[i], null)) {
                System.out.println("Name "+furniture[i].getName()+" Material "+furniture[i].getMaterial());
            }
        }
    }
    private void addRevenue(int revenue) {
        this.revenue += revenue;
    }
    public void addFurniture(String type, String name, String material) {
        for (int i = 0; i < furnitureCount; i++)
            if (Objects.equals(furniture[i], null)) {
                Scanner in = new Scanner(System.in);
                switch (type) {
                    case "chair":
                        System.out.print("Enter(legs): ");
                        furniture[i] = new Chair(name, material, in.nextInt());
                        return;
                    case "bed":
                        System.out.print("Enter(has mattress?): ");
                        furniture[i] = new Bed(name, material, in.nextBoolean());
                        return;
                }
            }
    }
    public void sellFurniture(String type, String name, String material) {
        for (int i = 0; i < furnitureCount; i++) {
            if (!Objects.equals(furniture[i], null)) {
                if (name == furniture[i].getName() && material == furniture[i].getMaterial()) {
                    switch (type) {
                        case "chair":
                            furniture[i] = null;
                            addRevenue(2500);
                            return;
                        case "bed":
                            furniture[i] = null;
                            addRevenue(5750);
                            return;
                    }
                }
            }
        }
    }
}
