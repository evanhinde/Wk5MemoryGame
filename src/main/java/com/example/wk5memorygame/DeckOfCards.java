package com.example.w23comp1008s1w5memorygame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<com.example.w23comp1008s1w5memorygame.Card> deck;

    public DeckOfCards()
    {
        deck = new ArrayList<>();
        List<String> suits = com.example.w23comp1008s1w5memorygame.Card.getValidSuits();
        List<String> faceNames = com.example.w23comp1008s1w5memorygame.Card.getValidFaceNames();

        for (int i=0; i< suits.size(); i++)
        {
            for (String faceName : faceNames)
                deck.add(new com.example.w23comp1008s1w5memorygame.Card(faceName, suits.get(i)));
        }
    }

    /**
     * This method will "deal" the top card from the deck
     */
    public com.example.w23comp1008s1w5memorygame.Card dealTopCard()
    {
        if (deck.size()>0)
            return deck.remove(0);
        else
            return null;
    }

    public void shuffle()
    {
        Collections.shuffle(deck);
    }
}