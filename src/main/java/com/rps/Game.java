package com.rps;

import com.rps.choice.Choice;
import com.rps.choice.Result;
import com.rps.player.ComputerPlayer;
import com.rps.player.Player;
import com.rps.player.strategy.Strategy;
import com.rps.ui.Menu;

import java.util.ArrayList;

public class Game {

    public static final int MAX_SIMULATIONS = 999;
    public static final int NUMBER_OF_PLAYERS = 2;
    public static ArrayList<Player> players = new ArrayList<>();
    public static ArrayList<Choice> choices = new ArrayList<>();
    public static int [] score = new int[NUMBER_OF_PLAYERS];

    public static void main(String[] args) {

        Menu.intro();
        int numGames = Menu.numberGamesSelection();
        Menu.infoStrategies();
        initPlayers();

        int currentGame = 0;
        while (currentGame <= numGames) {
            players.forEach(p -> choices.add(players.indexOf(p), p.play()));
            Result result = choices.get(0).battle(choices.get(1));
            Menu.playerVs(choices.get(0), choices.get(1), result);
            currentGame++;
        }

        Menu.finalResult();
    }


    private static void initPlayers() {
        for (int i = 0; i < NUMBER_OF_PLAYERS; i++) {
            Strategy strategy = Menu.playerStrategySelection(Integer.toString(i + 1));
            players.add(new ComputerPlayer(strategy));
        }
    }

}
