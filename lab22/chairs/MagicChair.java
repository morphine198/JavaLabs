package edu.lab22.chairs;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Performing magic on the chair");
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a magic chair");
    }
}
