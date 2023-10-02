package com.codedifferentlly.labs;

import com.codedifferentlly.labs.players.Player;

public class CardGame implements Game{
    private Deck deck;
    private Player player;
    private Player dealer;

    public CardGame(){
        deck = new Deck();
        player = new Player();
        dealer = new Player();
    }
    public Boolean play(Player player){
        return true;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public Player getDealer() {
        return dealer;
    }

    public void setDealer(Player dealer) {
        this.dealer = dealer;
    }

}
