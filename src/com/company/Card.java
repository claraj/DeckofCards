package com.company;

/**
 * Created by admin on 10/21/15.
 */
public class Card {


    String suit;
    String color;
    String value;

    public Card(String s, String c, String v) {
        this.suit=s;
        this.color=c;
        this.value=v;
    }


    public String toString(){
        return "Suit= " + suit + " value = " + value + " color= " + color;
    }


}
