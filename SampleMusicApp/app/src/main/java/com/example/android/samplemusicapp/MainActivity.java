package com.example.android.samplemusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;
    private float volume = 0.1f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMediaPlayer = MediaPlayer.create(this, R.raw.old_money);

        final Button playSong = (Button) findViewById(R.id.play);
        final Button pauseSong = (Button) findViewById(R.id.pause);
        Button increaseVolume = (Button) findViewById(R.id.increase);
        Button decreaseVolume = (Button) findViewById(R.id.decrease);

        TextView songInformation = (TextView) findViewById(R.id.song_information);
        MediaPlayer.TrackInfo[] playerTrackInfo = mMediaPlayer.getTrackInfo();

//        Log.d("Media_Player_Info", playerTrackInfo.);
//        songInformation.setText((String)playerTrackInfo.toString());


        playSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaPlayer.start();
                playSong.setEnabled(false);
                pauseSong.setEnabled(true);

            }
        });

        pauseSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMediaPlayer.pause();
                playSong.setEnabled(true);
                pauseSong.setEnabled(false);
            }
        });

        increaseVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volume = (float) (volume + 0.1);
                mMediaPlayer.setVolume(volume, volume);
            }
        });

        decreaseVolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volume = (float) (volume - 0.1);
                mMediaPlayer.setVolume(volume,volume);
            }
        });
    }
}
