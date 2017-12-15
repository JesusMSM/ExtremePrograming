/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp.model;

/**
 *
 * @author sanchezmartinez
 */
public class Card {
    Suit suit;
    int number;

    public Card(Suit suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
}
