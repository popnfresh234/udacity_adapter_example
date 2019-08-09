package com.dmtaiwan.alexander.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String SONG_KEY = "com.dmtaiwan.song";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("My Song", "My Artist"));
        songs.add(new Song("Some Other Song", "Some Other Artist"));
        songs.add(new Song("The Last Song", "The Last Artist"));

        ListView listView = findViewById(R.id.list_view);
        final SongAdapter adapter = new SongAdapter(this, songs);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Song clickedSong = (Song) adapter.getItem(i);
                Intent intent = new Intent(MainActivity.this, SongDetailActivity.class);
                intent.putExtra(SONG_KEY, clickedSong);
                startActivity(intent);
            }
        });
    }
}
