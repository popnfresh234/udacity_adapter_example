package com.dmtaiwan.alexander.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SongDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_details);
        TextView songName = findViewById(R.id.details_song_name);
        TextView artistName = findViewById(R.id.details_artist_name);

        Song clickedSong = getIntent().getParcelableExtra(MainActivity.SONG_KEY);

        songName.setText(clickedSong.getName());
        artistName.setText(clickedSong.getArtist());
    }
}
