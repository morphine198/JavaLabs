package edu.lab22.chairs;

public class Client {
    private Chair chair;
    public void sit() {
        chair.sit();
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
    Chair getChair() {
        return chair;
    }
}
