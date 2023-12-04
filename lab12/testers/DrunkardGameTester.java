package edu.lab12.testers;

import edu.lab12.game.DrunkardGame;
import java.util.Scanner;

public class DrunkardGameTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter player 1 cards: ");
        String cards1 = sc.nextLine();
        System.out.print("Enter player 2 cards: ");
        String cards2 = sc.nextLine();

        DrunkardGame.start(cards1, cards2, false);
    }
}
