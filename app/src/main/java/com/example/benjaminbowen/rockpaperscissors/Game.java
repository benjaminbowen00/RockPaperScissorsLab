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
    private Integer playerScore;
    private Integer computerScore;

    public Game() {
        arrayListPlayTypes = new ArrayList<>();
        arrayListPlayTypes.add("rock");
        arrayListPlayTypes.add("paper");
        arrayListPlayTypes.add("scissors");

        this.playerScore = 0;
        this.computerScore = 0;
    }

    public String getPlayerChoice() {
        return playerChoice;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public void setComputerToRandomChoice(){
        Collections.shuffle(arrayListPlayTypes);
        this.computerChoice = arrayListPlayTypes.get(0);
    }

    public void setPlayerChoice(String playerChoice){
        this.playerChoice = playerChoice;
    }

    public String getWinner(){
        if(this.playerChoice.equals(this.computerChoice)){
            return "It's a draw";
        }
        if(this.playerChoice.equals("rock") && this.computerChoice.equals("paper")){
            increaseComputerScore();
            return "The computer wins with paper";
        }
        if(this.playerChoice.equals("rock") && this.computerChoice.equals("scissors")){
            increasePlayerScore();
            return "You win with rock";
        }
        if(this.playerChoice.equals("paper") && this.computerChoice.equals("rock")){
            increasePlayerScore();
            return "You win with paper";
        }
        if(this.playerChoice.equals("paper") && this.computerChoice.equals("scissors")){
            increaseComputerScore();
            return "The computer wins with scissors";
        }
        if(this.playerChoice.equals("scissors") && this.computerChoice.equals("paper")){
            increasePlayerScore();
            return "You win with scissors";
        }
        if(this.playerChoice.equals("scissors") && this.computerChoice.equals("rock")){
            increaseComputerScore();
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

    public void increasePlayerScore(){
        this.playerScore++;
    }

    public void increaseComputerScore(){
        this.computerScore++;
    }

    public Integer getPlayerScore() {
        return playerScore;
    }

    public Integer getComputerScore() {
        return computerScore;
    }

    public String printScore(){
        return "The score\n\nYou: "+getPlayerScore().toString()+"\nComputer: "+getComputerScore().toString();
    }
}
