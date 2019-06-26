package pl.com.sda.javalon1.game.Players;

import pl.com.sda.javalon1.game.GameAction;

import java.util.Random;

public class RandomPlayer extends AbstractPlayer {

    private Random random = new Random();

    public RandomPlayer(String name) {
        super(name);
    }

    public GameAction chooseAction(){
        int output = random.nextInt(3);

        return getGameActionFromIf(output);

    }

    private GameAction getGameActionFromIf(int output) {
        if(output == 0)
        {
            return GameAction.ROCK;
        }
        else if(output ==1)
        {
            return GameAction.PAPER;
        }
        return GameAction.SCISSORS;
    }

}
