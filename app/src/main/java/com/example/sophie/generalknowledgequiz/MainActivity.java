package com.example.sophie.generalknowledgequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
        name = findViewById(R.id.name);
    }

    public void start_quiz(View v) {

        String user_name = name.getText().toString();

        Intent intent = new Intent(this, Quiz.class);
        intent.putExtra("user_name", user_name);
        startActivity(intent);
    }


}
