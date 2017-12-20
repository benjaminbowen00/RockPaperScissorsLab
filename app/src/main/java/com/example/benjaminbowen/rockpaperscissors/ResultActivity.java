package com.example.benjaminbowen.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView inputStatement;
    TextView outcomeStatement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        inputStatement = findViewById(R.id.input_statement);
        outcomeStatement = findViewById(R.id.outcome_statement);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        Game game = (Game) extras.get("game");

        inputStatement.setText(game.printInputs());
        outcomeStatement.setText(game.getWinner());





    }
}
