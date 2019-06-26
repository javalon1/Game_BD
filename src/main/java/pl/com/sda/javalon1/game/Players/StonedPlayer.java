package pl.com.sda.javalon1.game.Players;

import pl.com.sda.javalon1.game.GameAction;

public class StonedPlayer extends AbstractPlayer {

    public StonedPlayer(String name) {
        super(name);
    }

    public GameAction chooseAction() {
        return GameAction.ROCK;
    }
}
