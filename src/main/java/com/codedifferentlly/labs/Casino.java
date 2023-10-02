package com.codedifferentlly.labs;

import com.codedifferentlly.labs.players.CardPlayer;
import com.codedifferentlly.labs.players.Player;

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

    private void goFish() {
        GoFish goFish = new GoFish("Bruh");
        Deck deck = new Deck();
        System.out.println("You selected Go Fish");
        // Add relevant code for Option 1 functionality
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1 enter your name");
        String name = scanner.nextLine();
        CardPlayer player1 = new CardPlayer(name);
        System.out.println("Player 2 enter your name");
        String name2 = scanner.nextLine();
        CardPlayer player2 = new CardPlayer(name2);



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
                    goFish();
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
