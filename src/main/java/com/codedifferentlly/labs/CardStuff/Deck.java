package com.codedifferentlly.labs.CardStuff;

import com.codedifferentlly.labs.CardStuff.Card;
import com.codedifferentlly.labs.CardStuff.Rank;
import com.codedifferentlly.labs.CardStuff.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
        shuffleDeck();
    }

    private void initializeDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    private void shuffleDeck() {
        Collections.shuffle(cards);

    }

    public List<Card> dealHand(int numCards) {
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            if (!cards.isEmpty()) {
                hand.add(cards.remove(0));
            } else {
                System.out.println("The deck is empty!");
            }
        }
        return hand;
    }

    public int size() {
        return cards.size();
    }
}

