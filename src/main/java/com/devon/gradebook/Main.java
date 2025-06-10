package com.devon.gradebook;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static boolean running = true;

    public static void main(String[] args) {
        System.out.println("Welcome to the Student Gradebook");

        // Main menu loop
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();
            clearScreen();
            handleChoice(choice);
        }

        System.out.print("Closing gradebook...");
    }
    
    private static void printMenu() {
        System.out.println("\n=== Main Menu ===");
        System.out.println("1. Add student");
        System.out.println("2. Add course/grade to student");
        System.out.println("3. View all students");
        System.out.println("4. View student report card");
        System.out.println("5. Save gradebook to file");
        System.out.println("6. Load gradebook from file");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void handleChoice(String choice) {
        switch (choice) {
            case "1":
                System.out.println("[Add student] feature coming soon...");
                break;
            case "2":
                System.out.println("[Add grade] feature coming soon...");
                break;
            case "3":
                System.out.println("[List students] feature coming soon...");
                break;
            case "4":
                System.out.println("[Report card] feature coming soon...");
                break;
            case "5":
                System.out.println("[Save to file] feature coming soon...");
                break;
            case "6":
                System.out.println("[Load from file] feature coming soon...");
                break;
            case "7":
                running = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}