package edu.lab4.human;

public class TesterHuman {
    public static void main(String[] args) {
        Human human = new Human(81.6, 37);
        System.out.println("Human");
        System.out.println("weight "+human.getWeight());
        System.out.println("age "+human.getAge());

        System.out.println("Head");
        System.out.println("weight "+human.getHead().getWeight());
        human.getHead().setIsHaveBrain(true);
        System.out.println("have brain? "+human.getHead().getIsHaveBrain());

        System.out.println("Hands");
        System.out.println("weight left "+human.getHand1().getWeight());
        System.out.println("weight right "+human.getHand2().getWeight());
        human.getHand1().setLength(45.3);
        human.getHand2().setLength(45.2);
        System.out.println("length left "+human.getHand1().getLength());
        System.out.println("length right "+human.getHand2().getLength());

        System.out.println("Legs");
        System.out.println("weight left "+human.getLeg1().getWeight());
        System.out.println("weight right "+human.getLeg2().getWeight());
        human.getLeg1().setLength(46.3);
        human.getLeg2().setLength(46.6);
        System.out.println("length left "+human.getLeg1().getLength());
        System.out.println("length right "+human.getLeg2().getLength());
    }
}
