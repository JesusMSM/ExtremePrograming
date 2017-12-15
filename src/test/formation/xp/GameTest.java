/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp;

import formation.xp.model.Game;
import formation.xp.model.Player;
import java.util.ArrayList;
import org.junit.Test;

import junit.framework.TestCase;
/**
 *
 * @author lji
 */
public class GameTest extends TestCase{
    @Test
	public void test() {
            Player p1 = new Player("Joe", 2500);
            Player p2 = new Player("Doe", 2000);
            ArrayList<Player> players = new ArrayList<Player>();
            players.add(p1);
            players.add(p2);
            Game game = new Game(true,players);
            
            game.getPlayers().get(0).bet(1200);
            game.follow(game.getPlayers().get(1));
            
            assertEquals(game.getPlayers().get(0).getBetMoney(), game.getPlayers().get(1).getBetMoney());
            
            game.increaseRound();
            
            p1.showMyCards();
        
        }
    
}
