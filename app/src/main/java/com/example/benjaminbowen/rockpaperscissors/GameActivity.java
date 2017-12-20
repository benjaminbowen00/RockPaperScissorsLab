package com.example.benjaminbowen.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    TextView playerScore;
    TextView computerScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rockButton = findViewById(R.id.rock_button);
        paperButton = findViewById(R.id.paper_button);
        scissorsButton = findViewById(R.id.scissors_button);
        playerScore = findViewById(R.id.you_score);
        computerScore = findViewById(R.id.computer_score);

        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        Game game = (Game) extra.get("game");

        playerScore.setText(game.getPlayerScore().toString());
        computerScore.setText(game.getComputerScore().toString());
    }


    public String getCorrectInput(View view){
        switch(view.getId()){
            case R.id.rock_button:
                return "rock";
            case R.id.paper_button:
                return "paper";
            case R.id.scissors_button:
                return "scissors";
        }
        return null;
    }

    public void onButtonClicked(View view){
        String input = getCorrectInput(view);
        Intent intent = getIntent();
        Bundle extra = intent.getExtras();
        Game game = (Game) extra.get("game");

        game.setPlayerChoice(input);
        Log.d("You pressed", game.getPlayerChoice());

        game.setComputerToRandomChoice();

        Intent newIntent = new Intent(this, ResultActivity.class);
        newIntent.putExtra("game", game);
        startActivity(newIntent);

    }



}
