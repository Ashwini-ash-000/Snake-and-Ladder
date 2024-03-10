import dice.Dice;
import player.Player;
import coordinates.Coordinates;
import jumper.Jumper;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Snake And Ladder");

        // System.out.println("Enter the player details: ");

        Player p1 = new Player();
        Player p2 = new Player();

        p1.setPlayerDetails("Pinky", "PinkyAngel@.gmail.com", "198789349", 29, "Karnataka");  //1st method to initialise
        p2.setPlayerDetails("Monkey", "monkey1@25.gmail.com", "9477122378", 24, "Tamil Nadu");  //2nd method

        System.out.println("Player1 :" +p1.getPlayerName());
        System.out.println();

        System.out.println("Player2 :" +p2.getPlayerName());
        System.out.println();

        Dice dice = new Dice();

        System.out.println(dice.diceRoll());

        Coordinates c1 = new Coordinates(8, 10);
        Coordinates c2 = new Coordinates(6, 10);
        // coordinates.printCooridinates();

        Jumper j = new Jumper(c1, c2);
        System.out.println(j.getName());
    }

}
