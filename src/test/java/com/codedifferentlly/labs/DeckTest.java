package com.codedifferentlly.labs;

import com.codedifferentlly.labs.cards.Card;
import com.codedifferentlly.labs.cards.CardSuit;
import com.codedifferentlly.labs.cards.CardValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeckTest {
    private Deck deck;
    @BeforeEach
    public void setup() {
        deck = new Deck();
        Card card1 = new Card(CardSuit.SPADES, CardValue.ACE);
        Card card2 = new Card(CardSuit.SPADES, CardValue.TWO);
        Card card3 = new Card(CardSuit.SPADES, CardValue.THREE);
        deck.addCard(card1);
        deck.addCard(card2);
        deck.addCard(card3);
    }
    @Test
    public void testShuffle() {
        Assertions.assertFalse(deck.isShuffled());

        deck.shuffle();

        Assertions.assertTrue(deck.isShuffled());
        System.out.println(deck.viewCards());
    }




}
