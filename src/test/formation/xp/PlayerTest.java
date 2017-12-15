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
public class PlayerTest extends TestCase {
    
    @Test
	public void test() {
            Player p1 = new Player("Joe", 50);
            
            p1.increaseMoney(100);
            
            assertEquals(150, p1.getMoney());
            
            p1.decreaseMoney(50);
            
            assertEquals(100, p1.getMoney());
            
            p1.bet(55);
            
            assertEquals(p1.getBetMoney(), 55);
            assertEquals(p1.getMoney(), 45);
            
            p1.allin();
            assertEquals(p1.getMoney(), 0);
            
            p1.setMoney(100);
            p1.setBetMoney(0);
            
            p1.raise(50);
            assertEquals(p1.getMoney(), 50);
            
            p1.check();
            assertEquals(p1.getMoney(), 50);
            
            p1.showMyBetMoney();
        
        }
    
}
