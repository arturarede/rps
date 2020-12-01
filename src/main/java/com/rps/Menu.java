package com.rps;

import java.util.Scanner;

public class Menu {

    public int numberOfGames(Scanner scanner) {
        int numSim = 1;
        while (true) {
            System.out.print("How many simulations? ");
            String value = scanner.next();
            try {
                numSim = Integer.parseInt(value);
                if (numSim <= 0) {
                    System.out.println("Number of simulations must be greater than zero");
                } else if (numSim > Game.MAX_SIMULATIONS) {
                    System.out.println("Number of simulations is too high");
                } else {
                    break;
                }
            } catch(NumberFormatException e) {
                System.out.println("Input is not a number");
            }
        }
        return numSim;
    }
}
