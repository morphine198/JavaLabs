package edu.lab4.human;

public class Human {
    private double weight;
    private int age;
    private Head head;
    private Hand hand1;
    private Hand hand2;
    private Leg leg1;
    private Leg leg2;
    public Human() {
        weight = 75;
        age = 20;
        head = new Head(weight*0.07);
        hand1 = new Hand(weight*0.06);
        hand2 = new Hand(weight*0.06);
        leg1 = new Leg(weight*0.19);
        leg2 = new Leg(weight*0.19);
    }
    public Human(double weight) {
        this.weight = weight;
        age = 20;
        head = new Head(this.weight*0.07);
        hand1 = new Hand(this.weight*0.06);
        hand2 = new Hand(this.weight*0.06);
        leg1 = new Leg(this.weight*0.19);
        leg2 = new Leg(this.weight*0.19);
    }
    public Human(double weight, int age) {
        this.weight = weight;
        this.age = age;
        head = new Head(this.weight*0.07);
        hand1 = new Hand(this.weight*0.06);
        hand2 = new Hand(this.weight*0.06);
        leg1 = new Leg(this.weight*0.19);
        leg2 = new Leg(this.weight*0.19);
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }
    public Head getHead() {
        return head;
    }
    public Hand getHand1() {
        return hand1;
    }
    public Hand getHand2() {
        return hand2;
    }
    public Leg getLeg1() {
        return leg1;
    }
    public Leg getLeg2() {
        return leg2;
    }
}
