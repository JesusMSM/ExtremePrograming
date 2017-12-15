/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp.model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author sanchezmartinez
 */
public class Game {
    
    boolean started;
    ArrayList<Player> players;
    int round;
    ArrayList<Card> deck = new ArrayList<Card>();

    public int getRound() {
        return round;
    }

    public Game(boolean started, ArrayList<Player> players) {
        this.started = started;
        this.players = players;
        for (int i = 0; i < Suit.values().length; i++){
            for (int j = 2; j < 15; j++){
                this.deck.add(new Card(Suit.values()[i], j));                
            }
        }
    }

    public void setRound(int round) {
        this.round = round;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }


    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }
    
    public void increaseRound(){
        this.round++;
        Random randomGenerator = new Random();
        
        for (int i = 0; i < this.players.size(); i++){
            int randomInt = randomGenerator.nextInt(this.deck.size());
            this.players.get(i).addCard(this.deck.get(randomInt));
            this.deck.remove(randomInt);
            
            randomInt = randomGenerator.nextInt(this.deck.size());
            this.players.get(i).addCard(this.deck.get(randomInt));
            this.deck.remove(randomInt);
        }    
    }
    
    public void follow(Player p){
        int moneyToBet;
        int maxValue = -99;
        
        for (int i=0; i<this.players.size(); i++){
            if (this.players.get(i).getBetMoney()>maxValue)
                maxValue=this.players.get(i).getBetMoney();
        }
        moneyToBet = maxValue - p.getBetMoney();
        
        p.bet(moneyToBet);
    }
    
    
}
