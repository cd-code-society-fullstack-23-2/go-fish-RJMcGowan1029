package com.codedifferentlly.labs.GameTypes;


import com.codedifferentlly.labs.CardStuff.Card;
import com.codedifferentlly.labs.CardStuff.Deck;
import com.codedifferentlly.labs.CardStuff.Rank;
import com.codedifferentlly.labs.GameTypes.CardGame;
import com.codedifferentlly.labs.players.Player;

import java.util.List;
import java.util.Scanner;
    public class GoFish extends CardGame {
        private final Deck deck;
        private final Player player1;
        private final Player player2;
        private final Scanner scanner;

        public GoFish() {
            deck = new Deck();
            player1 = new Player();
            player2 = new Player();
            scanner = new Scanner(System.in);
        }

        public void play() {
            // Deal initial hands
            List<Card> cardsForPlayer1 = deck.dealHand(5);
            for (Card card : cardsForPlayer1) {
                player1.addCardToHand(card);
            }

            List<Card> cardsForPlayer2 = deck.dealHand(5);
            for (Card card : cardsForPlayer2) {
                player2.addCardToHand(card);
            }

            while (true) {
                // Display player hands
                System.out.println("Player 1's hand: " + player1.getHand());
                System.out.println("Player 2's hand: " + player2.getHand());

                // Player 1's turn
                takeTurn(player1, player2);
                System.out.println("Player 1's hand: " + player2.getHand());

                // Check for a winner
                if (player1.getHand().isEmpty() || player2.getHand().isEmpty()) {
                    System.out.println("Game over!");
                    break;
                }

                // Player 2's turn
                takeTurn(player2, player1);
                System.out.println("Player 2's hand: " + player1.getHand());

                // Check for a winner
                if (player1.getHand().isEmpty() || player2.getHand().isEmpty()) {
                    System.out.println("Game over!");
                    break;
                }
            }
        }

        private void takeTurn(Player currentPlayer, Player opponent) {
            System.out.println("Player " + (currentPlayer == player1 ? "1" : "2") + "'s turn:");

            // Ask for a rank
            System.out.print("Ask for a rank: ");
            Rank rank = Rank.valueOf(scanner.nextLine().toUpperCase());

            // Check if opponent has the rank
            if (opponent.hasCardWithRank(rank)) {
                List<Card> matchingCards = opponent.giveAllCardsWithRank(rank);
                currentPlayer.getHand().addAll(matchingCards);
                System.out.println("Got a match! Received: " + matchingCards);
            } else {
                System.out.println("Go Fish! Drawing a card...");
                Card drawnCard = deck.dealHand(1).get(0);
                currentPlayer.addCardToHand(drawnCard);
                System.out.println("Drew a " + drawnCard);
            }
        }
    }
