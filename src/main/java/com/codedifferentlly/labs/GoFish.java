package com.codedifferentlly.labs;

import com.codedifferentlly.labs.cards.Card;
import com.codedifferentlly.labs.cards.CardSuit;
import com.codedifferentlly.labs.cards.CardValue;
import com.codedifferentlly.labs.players.Player;

public class GoFish extends CardGame{
private Deck deck;
    public GoFish(String name) {
        super(name);
        Card aceOfSpades = new Card(CardSuit.SPADES, CardValue.ACE);
        Card twoOfSpades = new Card(CardSuit.SPADES, CardValue.TWO);
        Card threeOfSpades = new Card(CardSuit.SPADES, CardValue.THREE);
        Card fourOfSpades = new Card(CardSuit.SPADES, CardValue.FOUR);
        Card fiveOfSpades = new Card(CardSuit.SPADES, CardValue.FIVE);
        Card sixOfSpades = new Card(CardSuit.SPADES, CardValue.SIX);
        Card sevenOfSpades = new Card(CardSuit.SPADES, CardValue.SEVEN);
        Card eightOfSpades = new Card(CardSuit.SPADES, CardValue.EIGHT);
        Card nineOfSpades = new Card(CardSuit.SPADES, CardValue.NINE);
        Card tenOfSpades = new Card(CardSuit.SPADES, CardValue.TEN);
        Card jackOfSpades = new Card(CardSuit.SPADES, CardValue.JACK);
        Card queenOfSpades = new Card(CardSuit.SPADES, CardValue.QUEEN);
        Card kingOfSpades = new Card(CardSuit.SPADES, CardValue.KING);

        Card aceOfHearts = new Card(CardSuit.HEARTS, CardValue.ACE);
        Card twoOfHearts = new Card(CardSuit.HEARTS, CardValue.TWO);
        Card threeOfHearts = new Card(CardSuit.HEARTS, CardValue.THREE);
        Card fourOfHearts = new Card(CardSuit.HEARTS, CardValue.FOUR);
        Card fiveOfHearts = new Card(CardSuit.HEARTS, CardValue.FIVE);
        Card sixOfHearts = new Card(CardSuit.HEARTS, CardValue.SIX);
        Card sevenOfHearts = new Card(CardSuit.HEARTS, CardValue.SEVEN);
        Card eightOfHearts = new Card(CardSuit.HEARTS, CardValue.EIGHT);
        Card nineOfHearts = new Card(CardSuit.HEARTS, CardValue.NINE);
        Card tenOfHearts = new Card(CardSuit.HEARTS, CardValue.TEN);
        Card jackOfHearts = new Card(CardSuit.HEARTS, CardValue.JACK);
        Card queenOfHearts = new Card(CardSuit.HEARTS, CardValue.QUEEN);
        Card kingOfHearts = new Card(CardSuit.HEARTS, CardValue.KING);

        Card aceOfDiamonds = new Card(CardSuit.DIAMONDS, CardValue.ACE);
        Card twoOfDiamonds = new Card(CardSuit.DIAMONDS, CardValue.TWO);
        Card threeOfDiamonds = new Card(CardSuit.DIAMONDS, CardValue.THREE);
        Card fourOfDiamonds = new Card(CardSuit.DIAMONDS, CardValue.FOUR);
        Card fiveOfDiamonds = new Card(CardSuit.DIAMONDS, CardValue.FIVE);
        Card sixOfDiamonds = new Card(CardSuit.DIAMONDS, CardValue.SIX);
        Card sevenOfDiamonds = new Card(CardSuit.DIAMONDS, CardValue.SEVEN);
        Card eightOfDiamonds = new Card(CardSuit.DIAMONDS, CardValue.EIGHT);
        Card nineOfDiamonds = new Card(CardSuit.DIAMONDS, CardValue.NINE);
        Card tenOfDiamonds = new Card(CardSuit.DIAMONDS, CardValue.TEN);
        Card jackOfDiamonds = new Card(CardSuit.DIAMONDS, CardValue.JACK);
        Card queenOfDiamonds = new Card(CardSuit.DIAMONDS, CardValue.QUEEN);
        Card kingOfDiamonds = new Card(CardSuit.DIAMONDS, CardValue.KING);

        Card aceOfClubs = new Card(CardSuit.CLUBS, CardValue.ACE);
        Card twoOfClubs = new Card(CardSuit.CLUBS, CardValue.TWO);
        Card threeOfClubs = new Card(CardSuit.CLUBS, CardValue.THREE);
        Card fourOfClubs = new Card(CardSuit.CLUBS, CardValue.FOUR);
        Card fiveOfClubs = new Card(CardSuit.CLUBS, CardValue.FIVE);
        Card sixOfClubs = new Card(CardSuit.CLUBS, CardValue.SIX);
        Card sevenOfClubs = new Card(CardSuit.CLUBS, CardValue.SEVEN);
        Card eightOfClubs = new Card(CardSuit.CLUBS, CardValue.EIGHT);
        Card nineOfClubs = new Card(CardSuit.CLUBS, CardValue.NINE);
        Card tenOfClubs = new Card(CardSuit.CLUBS, CardValue.TEN);
        Card jackOfClubs = new Card(CardSuit.CLUBS, CardValue.JACK);
        Card queenOfClubs = new Card(CardSuit.CLUBS, CardValue.QUEEN);
        Card kingOfClubs = new Card(CardSuit.CLUBS, CardValue.KING);

        Deck deck = new Deck();
        deck.addCard(aceOfSpades);
        deck.addCard(twoOfSpades);
        deck.addCard(threeOfSpades);
        deck.addCard(fourOfSpades);
        deck.addCard(fiveOfSpades);
        deck.addCard(sixOfSpades);
        deck.addCard(sevenOfSpades);
        deck.addCard(eightOfSpades);
        deck.addCard(nineOfSpades);
        deck.addCard(tenOfSpades);
        deck.addCard(jackOfSpades);
        deck.addCard(queenOfSpades);
        deck.addCard(kingOfSpades);

        deck.addCard(aceOfHearts);
        deck.addCard(twoOfHearts);
        deck.addCard(threeOfHearts);
        deck.addCard(fourOfHearts);
        deck.addCard(fiveOfHearts);
        deck.addCard(sixOfHearts);
        deck.addCard(sevenOfHearts);
        deck.addCard(eightOfHearts);
        deck.addCard(nineOfHearts);
        deck.addCard(tenOfHearts);
        deck.addCard(jackOfHearts);
        deck.addCard(queenOfHearts);
        deck.addCard(kingOfHearts);

        deck.addCard(aceOfDiamonds);
        deck.addCard(twoOfDiamonds);
        deck.addCard(threeOfDiamonds);
        deck.addCard(fourOfDiamonds);
        deck.addCard(fiveOfDiamonds);
        deck.addCard(sixOfDiamonds);
        deck.addCard(sevenOfDiamonds);
        deck.addCard(eightOfDiamonds);
        deck.addCard(nineOfDiamonds);
        deck.addCard(tenOfDiamonds);
        deck.addCard(jackOfDiamonds);
        deck.addCard(queenOfDiamonds);
        deck.addCard(kingOfDiamonds);

        deck.addCard(aceOfClubs);
        deck.addCard(twoOfClubs);
        deck.addCard(threeOfClubs);
        deck.addCard(fourOfClubs);
        deck.addCard(fiveOfClubs);
        deck.addCard(sixOfClubs);
        deck.addCard(sevenOfClubs);
        deck.addCard(eightOfClubs);
        deck.addCard(nineOfClubs);
        deck.addCard(tenOfClubs);
        deck.addCard(jackOfClubs);
        deck.addCard(queenOfClubs);
        deck.addCard(kingOfClubs);
    }

    public void dealCards(Player player){
        deck.deal(7, player);
    }


}
