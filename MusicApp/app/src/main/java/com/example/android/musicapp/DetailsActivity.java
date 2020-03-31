package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Button nowPlaying = (Button) findViewById(R.id.playing_song);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(DetailsActivity.this, MainActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
