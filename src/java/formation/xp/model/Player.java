/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp.model;

import java.util.ArrayList;

/**
 *
 * @author sanchezmartinez
 */
public class Player {
    String name;
    ArrayList<Card> cards = new ArrayList<Card>();

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
    }
    int money;

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addCard(Card card){
        this.cards.add(card);
    }
    
}
