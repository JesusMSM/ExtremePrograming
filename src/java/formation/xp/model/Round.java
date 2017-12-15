/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.xp.model;

/**
 *
 * @author sanchezmartinez
 */
public class Round {
    int id;
    int money;

    public Round(int id, int money) {
        this.id = id;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    public void bet(Player p, int q){
        this.money+=q;
        p.decreaseMoney(q);
    }
    
    public void increaseId(){
        this.id++;
    }
    
}
