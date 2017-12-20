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
        String input = "rock";
        Game game = new Game(input);
        Log.d("You pressed", game.getPlayerChoice());

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("game", game);
        startActivity(intent);
    }

    public void onPaperButtonClicked(View button){
        String input = "paper";
        Game game = new Game(input);
        Log.d("You pressed", game.getPlayerChoice());

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("game", game);
        startActivity(intent);
    }

    public void onScissorsButtonClicked(View button){
        String input = "scissors";
        Game game = new Game(input);
        Log.d("You pressed", game.getPlayerChoice());

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("game", game);
        startActivity(intent);
    }
}
