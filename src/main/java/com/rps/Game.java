package com.rps;

import com.rps.strategy.AlwaysPickRock;
import com.rps.strategy.RandomChoice;
import com.rps.strategy.Strategy;
import com.rps.strategy.StrategyType;

public class Game {

    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("_________________________________");
        System.out.println("");
        System.out.println("");

        Strategy strategy = parse("rock");

        System.out.println(strategy.playStrategy().getName());
    }

    public static Strategy parse(String input){
        if (input.equalsIgnoreCase("random")) {
            return new RandomChoice();
        } else if (input.equalsIgnoreCase("rock")) {
            return new AlwaysPickRock();
        }
        throw new IllegalArgumentException("Not a valid strategy. Please choose between Random and Rock strategies.");
    }
}
