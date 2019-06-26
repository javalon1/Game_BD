package pl.com.sda.javalon1.game;

//import pl.com.sda.javalon1.game.Player;
import pl.com.sda.javalon1.game.Players.AbstractPlayer;
//import pl.com.sda.javalon1.game.Players.Player;
import pl.com.sda.javalon1.game.Players.ScannerPlayer;
import pl.com.sda.javalon1.game.Players.StonedPlayer;
/*import pl.com.sda.javalon1.game.ScannerPlayer;
import pl.com.sda.javalon1.game.StonedPlayer;*/

public class App
{
    public static void main( String[] args )
    {
        /*Player player1 = new Player()
        {
            public GameAction chooseAction()
            {
                return GameAction.ROCK;
            }
        };*/
        AbstractPlayer player1 = new ScannerPlayer("Zosia");
        AbstractPlayer player2 = new StonedPlayer("Ryan");
        Game game = new Game(player1,player2);
        game.startGame();
    }
}
