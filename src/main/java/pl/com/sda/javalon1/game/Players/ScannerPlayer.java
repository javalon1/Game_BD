package pl.com.sda.javalon1.game.Players;

import pl.com.sda.javalon1.game.GameAction;

import java.util.Scanner;

public class ScannerPlayer extends AbstractPlayer {


    public ScannerPlayer(String name) {
        super(name);
    }


    public GameAction chooseAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz akcje r/p/s");
        String input = scanner.next();
        return gameActionIf(input);
    }

    private GameAction gameActionIf(String input) {
        if(input.equalsIgnoreCase("r")||input.equalsIgnoreCase("rock"))
        {
            return GameAction.ROCK;
        }
        else if(input.equalsIgnoreCase("p")||input.equalsIgnoreCase("paper"))
        {
            return GameAction.PAPER;
        }
        return GameAction.SCISSORS;
    }

}
