package com.rps;

import com.rps.choice.Choice;
import com.rps.choice.Result;
import com.rps.player.ComputerPlayer;
import com.rps.player.Player;
import com.rps.player.strategy.AlwaysPickRock;
import com.rps.player.strategy.RandomChoice;
import com.rps.player.strategy.Strategy;

import java.util.Scanner;

public class Game {

    static final int MAX_SIMULATIONS = 9999;
    private int score[];

    public static void main(String[] args) {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("_________________________________");
        System.out.println("");
        System.out.println("");

        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        menu.numberOfGames(scan);

        Strategy random = parse("random");
        Strategy rock = parse("rock");

        Player player1 = new ComputerPlayer(random);
        Player player2 = new ComputerPlayer(rock);

        Choice choiceP1 = player1.play();
        Choice choiceP2 = player2.play();

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
