package edu.lab6.dog;

class Chihuahua extends Dogs {
    private boolean isFlattened;
    public Chihuahua (String name, int age, boolean isFlattened) {
        super(name, age);
        this.isFlattened = isFlattened;
    }
    public void displayInformation() {
        System.out.println("Name "+getName()+" Age "+getAge()+" Is flattened? "+isFlattened);
    }
}
