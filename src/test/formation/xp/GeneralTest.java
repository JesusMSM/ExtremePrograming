package formation.xp;

import formation.xp.model.Game;
import formation.xp.model.Player;
import java.util.ArrayList;
import org.junit.Test;

import junit.framework.TestCase;

public class GeneralTest extends TestCase {
	@Test
	public void test() {
            
            Player p1 = new Player("Joe", 0);
            Player p2 = new Player("Doe", 100);
            
            ArrayList<Player> players = new ArrayList<Player>();
            players.add(p1);
            players.add(p2);
            
            Game game = new Game(true,players);
            
            System.out.println(game.isStarted());
            System.out.println(game.getPlayers().toString());
            System.out.println(game.getPlayers().get(0).getName());
            
	}
}
