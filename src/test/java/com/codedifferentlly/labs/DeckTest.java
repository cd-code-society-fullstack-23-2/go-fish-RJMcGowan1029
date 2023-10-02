package com.codedifferentlly.labs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {


    @Test
    public void dealHand() {
            Deck deck = new Deck();
            int initialSize = deck.size();

            // Deal 5 cards
            deck.dealHand(5);

            assertEquals(initialSize - 5, deck.size());
        }
    }





