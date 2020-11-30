package com.rps.choice;

public class Rock implements Choice {

    @Override
    public Result getResult(Choice choice) {
        if (choice instanceof Scissors){
            return Result.WIN;
        } else if (choice instanceof Paper){
            return Result.LOSE;
        }
        return Result.TIE;
    }

    @Override
    public String getName() {
        return "Rock";
    }
}
