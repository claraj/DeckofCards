package com.company;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by admin on 10/21/15.
 */
public class Deck {


    LinkedList<Card> allTheCards;

    String[] suits = {"hearts", "clubs", "diamonds", "spades"};

    String[] values = {"A", "1", "2" , "3" , "4","5", "6" , "7" , "8","9", "10" , "J" , "Q","K",};

    public Deck() {


        //Create 52 cards and store in allTheCards.

        allTheCards = new LinkedList<Card>();

        for (String suit : suits) {

            for (String value : values) {

                String color;
                if ( suit.equals("hearts") || suit.equals("diamonds")) {
                    color = "red";
                } else {
                    color = "black";
                }

                Card newCard = new Card(suit, color, value);

                allTheCards.add(newCard);

            }

        }


        Collections.shuffle(allTheCards);


    }


    public Card drawCard(){
        return allTheCards.pop();

        //What happens if the deck is empty??

    }



}
