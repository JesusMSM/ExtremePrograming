package formation.xp;

import formation.xp.model.Game;
import org.junit.Test;

import junit.framework.TestCase;

public class GeneralTest extends TestCase {
	@Test
	public void test() {
            Game game = new Game(true);
            System.out.println(game.isStarted());
	}
}
