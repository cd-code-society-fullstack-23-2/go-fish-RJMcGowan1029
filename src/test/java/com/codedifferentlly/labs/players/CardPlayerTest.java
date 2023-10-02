package com.codedifferentlly.labs.players;

import com.codedifferentlly.labs.cards.Card;
import com.codedifferentlly.labs.cards.CardSuit;
import com.codedifferentlly.labs.cards.CardValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CardPlayerTest {

    @Test
    public void addCardsTest01(){
        Card card1 = new Card(CardSuit.CLUBS, CardValue.ACE);
        ArrayList cards = new ArrayList();
        cards.add(card1);

        CardPlayer player = new CardPlayer("Beyonce");
        player.addCards(cards);

        Integer expected = 1;
        Integer actual = player.getNumberOfCards();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void removeCardsTest01(){
        Card card1 = new Card(CardSuit.CLUBS, CardValue.ACE);
        Card cardieb = new Card(CardSuit.CLUBS, CardValue.SEVEN);
        Card playBoiCard = new Card(CardSuit.SPADES, CardValue.TWO);
        ArrayList cards = new ArrayList();
        cards.add(card1);
        cards.add(cardieb);
        cards.add(playBoiCard);

        CardPlayer player = new CardPlayer("Dat Dawg");
        player.addCards(cards);
        player.removeCards(2);
        Integer expected = 1;
        Integer actual = player.getNumberOfCards();

        Assertions.assertEquals(expected, actual);
    }
}
