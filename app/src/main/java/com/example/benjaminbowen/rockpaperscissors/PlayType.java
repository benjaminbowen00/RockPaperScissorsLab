package com.example.benjaminbowen.rockpaperscissors;

/**
 * Created by benjaminbowen on 20/12/2017.
 */

public enum PlayType {

    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private final String playTypeString;

    PlayType(String playTypeString) {
        this.playTypeString = playTypeString;
    }

    public String getPlayTypeString(){
        return this.playTypeString;
    }


}
