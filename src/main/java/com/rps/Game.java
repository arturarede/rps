package com.rps;

import com.rps.strategy.StrategyType;

public class Game {

    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("_________________________________");
        System.out.println("");
        System.out.println("");

        StrategyType strategyType = StrategyType.ONLY_ROCK;
        System.out.println(strategyType);
    }
}
