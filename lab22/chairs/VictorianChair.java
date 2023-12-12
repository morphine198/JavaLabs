package edu.lab22.chairs;

public class VictorianChair implements Chair {
    private int age;

    VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a Victorian chair");
    }

    public int getAge() {
        return age;
    }
}
