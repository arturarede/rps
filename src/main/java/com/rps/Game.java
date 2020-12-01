package com.rps;

import com.rps.choice.Choice;
import com.rps.choice.Result;
import com.rps.player.ComputerPlayer;
import com.rps.player.Player;
import com.rps.player.strategy.Strategy;
import com.rps.ui.Menu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Game {

    public static final int MAX_SIMULATIONS = 999;
    public static final int NUMBER_OF_PLAYERS = 2;
    public static int [] score = {0, 0};
    public static Collection<Player> players;

    public static void main(String[] args) {

        Menu.intro();
        int numGames = Menu.numberGamesSelection();
        Menu.infoStrategies();
        Strategy strategyP1 = Menu.playerStrategySelection("1");
        Strategy strategyP2 = Menu.playerStrategySelection("2");

        Player player1 = new ComputerPlayer(strategyP1);
        Player player2 = new ComputerPlayer(strategyP2);

        int currentGame = 0;
        while (currentGame <= numGames) {
            Choice choiceP1 = player1.play();
            Choice choiceP2 = player2.play();
            Result result = choiceP1.battle(choiceP2);
            Menu.playerVs(choiceP1, choiceP2, result);
            currentGame++;
        }

        Menu.finalResult(score);
    }





}
