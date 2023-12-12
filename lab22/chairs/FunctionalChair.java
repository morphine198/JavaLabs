package edu.lab22.chairs;

public class FunctionalChair implements Chair {
    int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a functional chair");
    }
}
