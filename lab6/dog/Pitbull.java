package edu.lab6.dog;

class Pitbull extends Dogs {
    private boolean isAggressive;
    public Pitbull (String name, int age, boolean isAggressive) {
        super(name, age);
        this.isAggressive = isAggressive;
    }
    public void displayInformation() {
        System.out.println("Name "+getName()+" Age "+getAge()+" Is aggressive? "+isAggressive);
    }
}
