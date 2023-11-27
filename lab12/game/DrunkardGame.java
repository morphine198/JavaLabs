package edu.lab12.game;

import java.util.Stack;

public class DrunkardGame {
    private static void shuffle(Stack<Integer> cs) {
        int[] randomArray = new int[10];
        for (int i = 0; i < 10; i++) {
            randomArray[i] = (int)(Math.random() * 10);
            for (int j = 0; j < i; j++) {
                if (randomArray[i] == randomArray[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int s = 0; s < 10; s++) {
            cs.add(randomArray[s]);
        }
    }
    private static void distribute(Stack<Integer> cs, Stack<Integer> pl1C, Stack<Integer> pl2C) {
        for (int i = 0; i < 5; i++) {
            pl1C.add(cs.pop());
            pl2C.add(cs.pop());
        }
    }
    private static int[] unload(Stack<Integer> plC) {
        int[] temp = new int[plC.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = plC.pop();
        }
        return temp;
    }
    private static void load(Stack<Integer> plC, int[] temp, int c) {
        plC.add(c);
        for (int i = temp.length-1; i >= 0; i--) {
            plC.add(temp[i]);
        }
    }
    private static void addCards(Stack<Integer> plC, int c1, int c2) {
        load(plC, unload(plC), c1);
        load(plC, unload(plC), c2);
    }

    private static void printCards(Stack<Integer> plC) {
        for (Integer integer : plC) {
            System.out.print(integer);
        }
        System.out.println();
    }

    public static void start() {
        Stack<Integer> cards = new Stack<>();
        Stack<Integer> player1Cards = new Stack<>();
        Stack<Integer> player2Cards = new Stack<>();
        int pl1C;
        int pl2C;

        shuffle(cards);
        distribute(cards, player1Cards, player2Cards);

        System.out.print("Player 1 cards: ");
        printCards(player1Cards);
        System.out.print("Player 2 cards: ");
        printCards(player2Cards);

        for (int step = 1; step <= 106; step++) {
            if (!player1Cards.isEmpty()) {
                pl1C = player1Cards.pop();
            } else {
                System.out.println("second "+step);
                return;
            }
            if (!player2Cards.isEmpty()) {
                pl2C = player2Cards.pop();
            } else {
                System.out.println("first "+step);
                return;
            }
            if (pl1C < pl2C) {
                if (player1Cards.isEmpty()) {
                    player1Cards.add(pl1C);
                    player1Cards.add(pl2C);
                } else {
                    addCards(player1Cards, pl1C,pl2C);
                }
            } else {
                if (player2Cards.isEmpty()) {
                    player2Cards.add(pl2C);
                    player2Cards.add(pl1C);
                } else {
                    addCards(player2Cards, pl2C,pl1C);
                }
            }
        }
        System.out.println("botva...");
    }
}
