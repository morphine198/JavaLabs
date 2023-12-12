package edu.lab22.chairs;

public class ChairFactory implements AbstractChairFactory {
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(getAge());
    }
    @Override
    public MagicChair createMagicanChair() {
        return new MagicChair();
    }
    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
    private int getAge() {
        // Логика получения возраста для VictorianChair
        return 5;
    }
}
