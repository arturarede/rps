package com.rps;

import com.rps.choice.Choice;
import com.rps.choice.Result;
import com.rps.player.ComputerPlayer;
import com.rps.player.Player;
import com.rps.player.strategy.Strategy;
import com.rps.ui.Menu;

public class Game {

    public static final int MAX_SIMULATIONS = 999;
    public static int [] score = {0, 0};

    public static void main(String[] args) {

        Menu.intro();
        int numGames = Menu.numberGamesSelection();
        Menu.infoStrategies();

        Strategy strategyP1 = Menu.playerStrategySelection("1");
        Strategy strategyP2 = Menu.playerStrategySelection("2");

        Player p1 = new ComputerPlayer(strategyP1);
        Player p2 = new ComputerPlayer(strategyP2);

        int currentGame = 0;
        while (currentGame <= numGames) {
            Choice choiceP1 = p1.play();
            Choice choiceP2 = p2.play();
            Result result = choiceP1.battle(choiceP2);
            Menu.playerVs(choiceP1, choiceP2, result);
            currentGame++;
        }

        Menu.finalResult();
    }

}
