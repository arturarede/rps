package com.rps.choice;

public class Rock implements Choice {

    @Override
    public Result getResult(Choice choice) {
        return null;
    }

    @Override
    public String getName() {
        return "Rock";
    }
}
