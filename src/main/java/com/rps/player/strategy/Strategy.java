package com.rps.player.strategy;

import com.rps.choice.Choice;

public interface Strategy {

    Choice play();
    StrategyType getName();
}
