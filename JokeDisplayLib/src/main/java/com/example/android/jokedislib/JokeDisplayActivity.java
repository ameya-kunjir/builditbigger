package com.example.android.jokedislib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        Intent intent = this.getIntent();

        if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)) {
            String jokeText = intent.getStringExtra(Intent.EXTRA_TEXT);
            TextView jokeTextView = (TextView) this.findViewById(R.id.joke_txt_view);
            jokeTextView.setText(jokeText);
        }
    }
}
