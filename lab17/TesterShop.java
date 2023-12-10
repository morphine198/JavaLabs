package edu.lab17;

import java.util.Scanner;
import static edu.lab17.Shop.isValidINN;

public class TesterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter SFT: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter INN: ");
        String inn = scanner.nextLine();

        try {
            if (isValidINN(inn)) {
                System.out.println("Number of INN is not valid. Order is issued for: " + fullName);
            } else {
                throw new Exception("Number of INN is not valid");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
