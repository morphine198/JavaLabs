package edu.lab22.chairs.testers;

import edu.lab22.chairs.*;

public class TesterChairs {
        public static void main(String[] args) {
            // Создаем экземпляр фабрики
            AbstractChairFactory factory = new ChairFactory();

            // Создаем различные типы стульев с помощью фабрики
            VictorianChair victorianChair = factory.createVictorianChair();
            MagicChair magicChair = factory.createMagicanChair();
            FunctionalChair functionalChair = factory.createFunctionalChair();

            // Создаем клиента
            Client client = new Client();

            // Устанавливаем стулья клиенту
            client.setChair(victorianChair);
            client.sit();

            client.setChair(magicChair);
            client.sit();

            client.setChair(functionalChair);
            client.sit();
        }
}
