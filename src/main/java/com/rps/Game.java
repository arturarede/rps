package com.rps;

import com.rps.choice.Choice;
import com.rps.choice.Result;
import com.rps.strategy.AlwaysPickRock;
import com.rps.strategy.RandomChoice;
import com.rps.strategy.Strategy;

public class Game {

    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("_________________________________");
        System.out.println("");
        System.out.println("");

        Strategy strategyP1 = parse("random");
        Strategy strategyP2 = parse("rock");

        Choice choiceP1 = strategyP1.playStrategy();
        Choice choiceP2 = strategyP2.playStrategy();

        Result result = choiceP1.getResult(choiceP2);

        System.out.println("Player 1 played: " + choiceP1.getName());
        System.out.println("Player 2 played: " + choiceP2.getName());
        System.out.println("Result (Player 1): " + result);
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
