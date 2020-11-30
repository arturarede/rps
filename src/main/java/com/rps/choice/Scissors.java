package com.rps.choice;

public class Scissors implements Choice {

    @Override
    public Result getResult(Choice choice) {
        return null;
    }

    @Override
    public String getName() {
        return "Scissors";
    }
}
