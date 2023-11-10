package edu.lab6.dish;

class Cup extends Dish {
    private boolean isHasHandle;
    public Cup(String name, String material, boolean isHasHandle) {
        super(name, material);
        this.isHasHandle = isHasHandle;
    }
    public void displayInformation() {
        System.out.println("Name "+getName()+" Material "+getMaterial()+" Has handle? "+isHasHandle);
    }
}
