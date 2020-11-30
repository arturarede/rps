package com.rps.player;

import com.rps.choice.Choice;
import com.rps.player.strategy.Strategy;

public class ComputerPlayer implements Player {

    private Strategy strategy;

    public ComputerPlayer(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public Choice play() {
        return strategy.play();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
