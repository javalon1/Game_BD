package pl.com.sda.javalon1.game.Players;

import pl.com.sda.javalon1.game.GameAction;

public abstract class AbstractPlayer {
    private final String name;

    public AbstractPlayer(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract GameAction chooseAction();
}
