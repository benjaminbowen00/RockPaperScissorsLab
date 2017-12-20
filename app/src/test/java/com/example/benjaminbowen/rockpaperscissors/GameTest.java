package com.example.benjaminbowen.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by benjaminbowen on 20/12/2017.
 */

public class GameTest {

    private Game game;

    @Before
    public void before(){
        game = new Game("Rock");
    }

    @Test
    public void canGetPlayersChoice(){
        assertEquals("Rock", game.getPlayerChoice());
    }

    @Test
    public void canGetComputerChoice(){
        assertNotNull(game.getComputerChoice());
//        assertEquals("Rock", game.getComputerChoice());
    }

    @Test
    public void canGetWinnerDraw(){
        game.setComputerChoice("Rock");
        assertEquals("It's a draw", game.getWinner());
    }

    @Test
    public void canGetWinnerComputerPaper(){
        game.setComputerChoice("Paper");
        assertEquals("The computer wins with paper", game.getWinner());
    }

    @Test
    public void canGetWinnerCOmputerScissors(){
        game.setComputerChoice("Scissors");
        assertEquals("The player wins with rock", game.getWinner());
    }


//    @Test
//    public void canGetRandomWinner(){
//        assertEquals("The player wins with rock", game.getWinner());
//    }
}
