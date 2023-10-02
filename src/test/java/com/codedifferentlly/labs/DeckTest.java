package com.codedifferentlly.labs;
import com.codedifferentlly.labs.CardStuff.Deck;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {


    @Test
    public void dealHand() {
            Deck deck = new Deck();
            int initialSize = deck.size();


            deck.dealHand(5);

            assertEquals(initialSize - 5, deck.size());
        }
    }





