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
    TextView score;
    Button playAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        inputStatement = findViewById(R.id.input_statement);
        outcomeStatement = findViewById(R.id.outcome_statement);
        score = findViewById(R.id.score_text);
        playAgainButton = findViewById(R.id.play_again_button);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        Game game = (Game) extras.get("game");

        inputStatement.setText(game.printInputs());
        outcomeStatement.setText(game.getWinner());
        score.setText(game.printScore());
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
