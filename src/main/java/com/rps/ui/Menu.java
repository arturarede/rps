package com.rps.ui;

import com.rps.Game;
import com.rps.player.ComputerPlayer;
import com.rps.player.strategy.AlwaysPickRock;
import com.rps.player.strategy.RandomChoice;
import com.rps.player.strategy.Strategy;

import java.util.Scanner;

public class Menu {

    public static void intro() {
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("_________________________________");
        System.out.println();
        System.out.println();
    }

    public static int numberGamesSelection() {
        Scanner scanner = new Scanner(System.in);
        int numSim = 1;
        while (true) {
            System.out.print("How many simulations? ");
            String input = scanner.next();
            try {
                numSim = Integer.parseInt(input);
                if (numSim <= 0) {
                    System.out.println("Number of simulations must be greater than zero");
                } else if (numSim > Game.MAX_SIMULATIONS) {
                    System.out.println("Number of simulations is too high");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input is not a number");
            }
        }
        return numSim;
    }

    public static void infoStrategies() {
        System.out.println();
        System.out.println("Please choose a strategy for each player:");
        System.out.println("1 - Random Choice");
        System.out.println("2 - Always Pick Rock");
        System.out.println();
    }

    public static Strategy playerStrategySelection(String playerName) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("What should be the Player " + playerName + " strategy? ");
            String input = scanner.next();
            try {
                int value = Integer.parseInt(input);
                return parseComputerStrategy(value);
            } catch (NumberFormatException e) {
                System.out.println("Input is not a number");
            } catch (IllegalArgumentException e) {
                System.out.println("Not a valid strategy");
            }
        }
    }

    public static Strategy parseComputerStrategy(int value){
        return switch (value) {
            case 1 -> new RandomChoice();
            case 2 -> new AlwaysPickRock();
            default -> throw new IllegalArgumentException("Not a valid strategy");
        };
    }

    public static void finalResult() {
        System.out.println();
        System.out.println("End of the game!");
//        System.out.println(Game.score > computerScore ?
//                "Congratulation Player " + userName + "! Game score: " + );
    }
}
