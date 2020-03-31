package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button songDetail = (Button) findViewById(R.id.song_detail);
        Button musicStore = (Button) findViewById(R.id.music_store);
        Button musicList = (Button) findViewById(R.id.music_list);

        songDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songDetailsIntent = new Intent(MainActivity.this, DetailsActivity.class);
                startActivity(songDetailsIntent);
            }
        });


        musicStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicStoreIntent = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(musicStoreIntent);
            }
        });

        musicList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicListIntent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(musicListIntent);
            }
        });
    }
}
