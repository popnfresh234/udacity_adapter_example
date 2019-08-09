package com.dmtaiwan.alexander.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter {

    private ArrayList<Song> songs;
    private Context context;

    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
        this.songs = songs;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Song song = (Song) getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_song, parent, false);
        }

        TextView songNameTextView = (TextView) convertView.findViewById(R.id.song_name);
        TextView artistNameTextView = (TextView) convertView.findViewById(R.id.artist_name);

        songNameTextView.setText(song.getName());
        artistNameTextView.setText(song.getArtist());

        return convertView;
    }
}
