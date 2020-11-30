package com.rps.player.strategy;

import com.rps.choice.Choice;
import com.rps.choice.Rock;

public class AlwaysPickRock implements Strategy {

    @Override
    public Choice play() {
        return new Rock();
    }

    @Override
    public StrategyType getName() {
        return StrategyType.ALWAYS_ROCK;
    }
}
