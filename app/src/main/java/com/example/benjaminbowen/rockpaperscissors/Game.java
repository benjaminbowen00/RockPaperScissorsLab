package com.example.benjaminbowen.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by benjaminbowen on 20/12/2017.
 */

public class Game {

    private String  playerChoice;
    private  String computerChoice;
    private ArrayList<String> arrayListPlayTypes;

    public Game(String playerChoice) {
        this.playerChoice = playerChoice;
        arrayListPlayTypes = new ArrayList<>();
        arrayListPlayTypes.add("Rock");
        arrayListPlayTypes.add("Paper");
        arrayListPlayTypes.add("Scissors");


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
        if(this.playerChoice.equals("Rock") && this.computerChoice.equals("Paper")){
            return "The computer wins with paper";
        }
        if(this.playerChoice.equals("Rock") && this.computerChoice.equals("Scissors")){
            return "The player wins with rock";
        }
        if(this.playerChoice.equals("Paper") && this.computerChoice.equals("Rock")){
            return "The player wins with paper";
        }
        if(this.playerChoice.equals("Paper") && this.computerChoice.equals("Scissors")){
            return "The computer wins with scissors";
        }
        if(this.playerChoice.equals("Scissors") && this.computerChoice.equals("Paper")){
            return "The player wins with scissors";
        }
        if(this.playerChoice.equals("Scissors") && this.computerChoice.equals("Rock")){
            return "The computer wins with rock";
        }
        return null;
    }

    public void setComputerChoice(String computerChoice) {
        this.computerChoice = computerChoice;
    }
}
