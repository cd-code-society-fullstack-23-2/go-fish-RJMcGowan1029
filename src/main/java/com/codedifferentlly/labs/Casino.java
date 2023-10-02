package com.codedifferentlly.labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Casino {
    private void displayMenu() {
        System.out.println("====================================");
        System.out.println("  WELCOME TO THE CASINO APP");
        System.out.println("====================================");
        System.out.println("1. Go Fish");
        System.out.println("0. Exit");
        System.out.println();
    }

    private void playGoFish() {
        GoFish goFish = new GoFish();
        goFish.play();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    playGoFish();
                    break;
                case 0:
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public static void main(String[] args) {
        Casino app = new Casino();
        app.start();
    }
}
