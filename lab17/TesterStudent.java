package edu.lab17;

import java.util.Scanner;

public class TesterStudent {
    public static void main(String[] args) {
        LabClassUI labClassUI = new LabClassUI(5);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add student");
            System.out.println("2. Search for student");
            System.out.println("3. Sort students by ID number");
            System.out.println("4. Display students");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    labClassUI.addStudent();
                    break;
                case 2:
                    labClassUI.searchStudent();
                    break;
                case 3:
                    labClassUI.sortStudentsByIDNumber();
                    break;
                case 4:
                    labClassUI.displayStudents();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}
