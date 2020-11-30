package com.rps.strategy;

import com.rps.choice.Choice;

public interface Strategy {

    Choice playStrategy();
    StrategyType getStrategyName();
}
