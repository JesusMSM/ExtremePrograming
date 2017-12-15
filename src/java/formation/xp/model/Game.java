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
public class Game {
    
    boolean started;
    ArrayList<Player> players;

    public Game(boolean started, ArrayList<Player> players) {
        this.started = started;
        this.players = players;
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
    
    
    
}
