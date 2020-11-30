package com.rps.strategy;

import com.rps.choice.Choice;
import com.rps.choice.Rock;

public class AlwaysPickRock implements Strategy {

    @Override
    public Choice playStrategy() {
        return new Rock();
    }

    @Override
    public StrategyType getStrategyName() {
        return StrategyType.ALWAYS_ROCK;
    }
}
