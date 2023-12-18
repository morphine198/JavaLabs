package edu.lab24.interfaces;

public interface Order {
    boolean addItem(Item item);
    boolean removeItem(String itemName);
    int removeAll(String itemName);
    int getTotalCount();
    Item[] getItems();
    double getTotalPrice();
    int getCount(String itemName);
    String[] getOrderedItems();
    Item[] getSortedItems();
}

