package edu.lab6.furniture;

class Bed extends Furniture{
    private boolean isHasMattress;
    public Bed(String name, String material, boolean isHasMattress) {
        super(name, material);
        this.isHasMattress = isHasMattress;
    }
    public void displayInformation() {
        System.out.println("Name "+getName()+" Material "+getMaterial()+" Has mattress? "+isHasMattress);
    }
}
