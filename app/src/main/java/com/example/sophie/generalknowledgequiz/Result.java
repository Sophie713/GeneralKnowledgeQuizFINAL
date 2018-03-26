package com.example.sophie.generalknowledgequiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class Result extends AppCompatActivity {
    TextView final_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_screen);
        final_message = findViewById(R.id.final_message);

        Intent intent = getIntent();
        String user_name = intent.getStringExtra("user_name");
        int score = intent.getIntExtra("score", 0);

        if (score > 8) {
            String text = String.format(getResources().getString(R.string.top), String.valueOf(score), user_name);
            final_message.setText(text);
        } else if (score > 5) {
            String text = String.format(getResources().getString(R.string.medium), String.valueOf(score), user_name);
            final_message.setText(text);
        } else {
            String text = String.format(getResources().getString(R.string.low), String.valueOf(score), user_name);
            final_message.setText(text);
        }

    }

    public void go_back(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
