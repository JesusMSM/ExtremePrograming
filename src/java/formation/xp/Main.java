package formation.xp;

import formation.xp.model.Game;
import formation.xp.model.Player;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
            Player p1 = new Player("Joe", 2000);
            Player p2 = new Player("Doe", 2000);
            ArrayList<Player> players = new ArrayList<Player>();
            players.add(p1);
            players.add(p2);
            Game game = new Game(true,players);
            int idJoueur = 0;
            int i = idJoueur % 2;
            game.increaseRound();
            
            while(true){
                i = idJoueur % 2;
                
                Scanner reader = new Scanner(System.in);
                System.out.println("Joueur " + game.getPlayers().get(i).getName());
                game.getPlayers().get(i).showMyCards();
                System.out.println("Tu as " + game.getPlayers().get(i).getMoney());
                System.out.println("Tu as parié " + game.getPlayers().get(i).getBetMoney());
                System.out.println("");
                System.out.println("Que veux-tu faire ?");
                System.out.println("Miser : m / Suivre : s / Tapis : t / Relancer : r / Passer : p");
                String s = reader.next();

                if (s.equals("m")){
                    System.out.println("Combien ?");
                    int mise = reader.nextInt();
                    game.getPlayers().get(i).bet(mise);
                }

                else if (s.equals("s")){
                    game.follow(game.getPlayers().get(i));
                }

                else if (s.equals("t")){
                    game.getPlayers().get(i).allin();
                }

                else if (s.equals("r")){
                    System.out.println("Combien ?");
                    int mise = reader.nextInt();
                    game.getPlayers().get(i).raise(mise);
                }
                else {
                    // ANY OTHER CASES
                    game.getPlayers().get(i).check();
                }
                System.out.println("-------------------");
                idJoueur++;
                
            }
	}
}
