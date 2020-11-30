package com.rps.choice;

public class Paper implements Choice {

    @Override
    public Result getResult(Choice choice) {
        if (choice instanceof Rock){
            return Result.WIN;
        } else if (choice instanceof Scissors){
            return Result.LOSE;
        }
        return Result.TIE;
    }

    @Override
    public String getName() {
        return "Paper";
    }
}
