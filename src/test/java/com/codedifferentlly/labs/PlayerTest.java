package com.codedifferentlly.labs;

import com.codedifferentlly.labs.CardStuff.Card;
import com.codedifferentlly.labs.CardStuff.Rank;
import com.codedifferentlly.labs.CardStuff.Suit;
import com.codedifferentlly.labs.players.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    void addCardToHand() {
        Player player = new Player();
        Card card = new Card(Rank.ACE, Suit.HEARTS);

        player.addCardToHand(card);

        assertTrue(player.getHand().contains(card));
    }

    @Test
    void removeCardFromHand() {
        Player player = new Player();
        Card card = new Card(Rank.TWO, Suit.DIAMONDS);
        player.addCardToHand(card);

        player.removeCardFromHand(card);

        assertFalse(player.getHand().contains(card));
    }

    @Test
    void hasCardWithRank() {
        Player player = new Player();
        Card card = new Card(Rank.KING, Suit.CLUBS);
        player.addCardToHand(card);

        assertTrue(player.hasCardWithRank(Rank.KING));
        assertFalse(player.hasCardWithRank(Rank.QUEEN));
    }

    @Test
    void giveAllCardsWithRank() {
        Player player = new Player();
        Card card1 = new Card(Rank.THREE, Suit.SPADES);
        Card card2 = new Card(Rank.THREE, Suit.HEARTS);
        Card card3 = new Card(Rank.FOUR, Suit.DIAMONDS);

        player.addCardToHand(card1);
        player.addCardToHand(card2);
        player.addCardToHand(card3);

        assertEquals(2, player.giveAllCardsWithRank(Rank.THREE).size());
        assertEquals(1, player.getHand().size());
    }
}
