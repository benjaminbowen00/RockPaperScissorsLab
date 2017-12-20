package com.example.benjaminbowen.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rockButton = findViewById(R.id.rock_button);
        paperButton = findViewById(R.id.paper_button);
        scissorsButton = findViewById(R.id.scissors_button);

    }

    public void onRockButtonClicked(View button){
        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        Game game = (Game) extra.get("game");

        String input = "rock";
        game.setPlayerChoice(input);
        Log.d("You pressed", game.getPlayerChoice());

        game.setComputerToRandomChoice();
        String winner = game.getWinner();
        String info = game.printInputs();

        Intent newIntent = new Intent(this, ResultActivity.class);
        newIntent.putExtra("winner", winner);
        newIntent.putExtra("info", info);
        startActivity(newIntent);
    }

    public void onPaperButtonClicked(View button){
        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        Game game = (Game) extra.get("game");

        String input = "paper";
        game.setPlayerChoice(input);
        Log.d("You pressed", game.getPlayerChoice());

        game.setComputerToRandomChoice();
        String winner = game.getWinner();
        String info = game.printInputs();

        Intent newIntent = new Intent(this, ResultActivity.class);
        newIntent.putExtra("winner", winner);
        newIntent.putExtra("info", info);
        startActivity(newIntent);
    }

    public void onScissorsButtonClicked(View button){
        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        Game game = (Game) extra.get("game");

        String input = "scissors";
        game.setPlayerChoice(input);
        Log.d("You pressed", game.getPlayerChoice());

        game.setComputerToRandomChoice();
        String winner = game.getWinner();
        String info = game.printInputs();

        Intent newIntent = new Intent(this, ResultActivity.class);
        newIntent.putExtra("winner", winner);
        newIntent.putExtra("info", info);
        startActivity(newIntent);
    }
}
