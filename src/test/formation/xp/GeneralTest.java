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
            
            game.increaseRound();
            
            assertTrue(game.isStarted());
            assertEquals(2, game.getPlayers().get(0).getCards().size());
            assertFalse(game.getDeck().contains(game.getPlayers().get(0).getCards().get(0)));
            
            
            
	}
}
