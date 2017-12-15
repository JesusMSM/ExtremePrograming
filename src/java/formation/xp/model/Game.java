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
    Round round;
    ArrayList<Card> deck = new ArrayList<Card>();

    public Round getRound() {
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
        this.round = new Round(0,0);
    }

    public void setRound(Round round) {
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
        this.round.increaseId();
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
    
    
}
