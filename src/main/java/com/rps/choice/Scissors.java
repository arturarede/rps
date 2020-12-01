package com.rps.choice;

public class Scissors implements Choice {

    @Override
    public Result battle(Choice choice) {
        if (choice instanceof Paper){
            return Result.WIN;
        } else if (choice instanceof Rock){
            return Result.LOSE;
        }
        return Result.TIE;
    }

    @Override
    public String getName() {
        return "Scissors";
    }
}
