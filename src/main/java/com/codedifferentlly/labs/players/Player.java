package com.codedifferentlly.labs.players;

import com.codedifferentlly.labs.Card;
import com.codedifferentlly.labs.Rank;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<Card> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    public List<Card> getHand() {
        return hand;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public void removeCardFromHand(Card card) {
        hand.remove(card);
    }

    public boolean hasCardWithRank(Rank rank) {
        for (Card card : hand) {
            if (card.rank == rank) {
                return true;
            }
        }
        return false;
    }

    public List<Card> giveAllCardsWithRank(Rank rank) {
        List<Card> matchingCards = new ArrayList<>();
        for (Card card : hand) {
            if (card.rank == rank) {
                matchingCards.add(card);
            }
        }
        hand.removeAll(matchingCards);
        return matchingCards;
    }
}