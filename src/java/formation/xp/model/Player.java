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
    int betMoney;
    int money;

    public int getBetMoney() {
        return betMoney;
    }

    public void setBetMoney(int betMoney) {
        this.betMoney = betMoney;
    }
    
    public Player(String name, int money) {
        this.name = name;
        this.money = money;
    }
 
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
    
    public void increaseMoney(int q){
        this.money+=q;
    }
    
    public void decreaseMoney(int q){
        this.money-=q;
    }
    
    public void increaseBetMoney(int q){
        this.betMoney+=q;
    }
    
    public void decreaseBetMoney(int q){
        this.betMoney-=q;
    }
    
    public void bet(int q){
        this.money-=q;
        this.betMoney+=q;
    }
    
    public void allin(){
        bet(this.money);
    }
    
    public void raise(int q){
        bet(q);
    }
    
    public void check(){
        System.out.println("Le joueur a passé");
    }
}
