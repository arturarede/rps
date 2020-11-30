package com.rps.strategy;

import com.rps.choice.Choice;
import com.rps.choice.Paper;
import com.rps.choice.Rock;
import com.rps.choice.Scissors;

import java.util.Random;

public class RandomChoice implements Strategy {

    private final Choice[] possibleChoices = {new Rock(), new Paper(), new Scissors()};

    @Override
    public Choice playStrategy() {
        Random randomChoice = new Random();
        int randomIndex = randomChoice.nextInt(possibleChoices.length);
        return possibleChoices[randomIndex];
    }

    @Override
    public StrategyType getStrategyName() {
        return StrategyType.RANDOM;
    }
}
