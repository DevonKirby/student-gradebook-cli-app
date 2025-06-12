package com.devon.gradebook;

import com.devon.gradebook.service.GradebookService;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final GradebookService gradebookService = new GradebookService();
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
            case "1" -> handleAddStudent();
            case "2" -> handleAddGrade();
            case "3" -> gradebookService.listStudents();
            case "4" -> handlePrintReportCard();
            case "5" -> System.out.println("Save feature coming soon...");
            case "6" -> System.out.println("Load feature coming soon...");
            case "7" -> running = false;
            default -> System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void handleAddStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();
        gradebookService.addStudent(name);
    }

    private static void handleAddGrade() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter course name: ");
        String course = scanner.nextLine().trim();
        System.out.print("Enter grade (A-F): ");
        String grade = scanner.nextLine().trim();
        gradebookService.addGrade(name, course, grade);
    }

    private static void handlePrintReportCard() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine().trim();
        gradebookService.printReportCard(name);
    }

    private static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}