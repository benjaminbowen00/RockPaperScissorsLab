package com.example.benjaminbowen.rockpaperscissors;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by benjaminbowen on 20/12/2017.
 */

public class Game implements Serializable {

    private String  playerChoice;
    private String computerChoice;
    private ArrayList<String> arrayListPlayTypes;

    public Game(String playerChoice) {
        this.playerChoice = playerChoice;
        arrayListPlayTypes = new ArrayList<>();
        arrayListPlayTypes.add("rock");
        arrayListPlayTypes.add("paper");
        arrayListPlayTypes.add("scissors");


        Collections.shuffle(arrayListPlayTypes);
        this.computerChoice = arrayListPlayTypes.get(0);
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public String getWinner(){
        if(this.playerChoice.equals(this.computerChoice)){
            return "It's a draw";
        }
        if(this.playerChoice.equals("rock") && this.computerChoice.equals("paper")){
            return "The computer wins with paper";
        }
        if(this.playerChoice.equals("rock") && this.computerChoice.equals("scissors")){
            return "You win with rock";
        }
        if(this.playerChoice.equals("paper") && this.computerChoice.equals("rock")){
            return "You win with paper";
        }
        if(this.playerChoice.equals("paper") && this.computerChoice.equals("scissors")){
            return "The computer wins with scissors";
        }
        if(this.playerChoice.equals("scissors") && this.computerChoice.equals("paper")){
            return "You win with scissors";
        }
        if(this.playerChoice.equals("scissors") && this.computerChoice.equals("rock")){
            return "The computer wins with rock";
        }
        return null;
    }

    public void setComputerChoice(String computerChoice) {
        this.computerChoice = computerChoice;
    }

    public String printInputs(){
        return "The computer played " + getComputerChoice() + " and you played " + getPlayerChoice() + ".";
    }

}
