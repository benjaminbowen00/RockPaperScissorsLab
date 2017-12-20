package com.example.benjaminbowen.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView inputStatement;
    TextView outcomeStatement;
    TextView playerScore;
    TextView computerScore;
    Button playAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        inputStatement = findViewById(R.id.input_statement);
        outcomeStatement = findViewById(R.id.outcome_statement);
        playAgainButton = findViewById(R.id.play_again_button);
        playerScore = findViewById(R.id.you_score2);
        computerScore = findViewById(R.id.computer_score2);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        Game game = (Game) extras.get("game");

        inputStatement.setText(game.printInputs());
        outcomeStatement.setText(game.getWinner());
        playerScore.setText(game.getPlayerScore().toString());
        computerScore.setText(game.getComputerScore().toString());
    }

    public void onPlayAgainButtonClicked(View button){
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        Game game = (Game) extras.get("game");
        game.getWinner();

        Intent newIntent = new Intent(this, GameActivity.class);
        newIntent.putExtra("game", game);

        startActivity(newIntent);

    }

}
