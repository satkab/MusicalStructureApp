package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AllSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_songs);

        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(R.string.song1, R.drawable.playpicture));
        songs.add(new Song(R.string.song2, R.drawable.playpicture));
        songs.add(new Song(R.string.song3, R.drawable.playpicture));
        songs.add(new Song(R.string.song4, R.drawable.playpicture));
        songs.add(new Song(R.string.song5, R.drawable.playpicture));
        songs.add(new Song(R.string.song6, R.drawable.playpicture));

        SongAdapter songsAdapter = new SongAdapter(this, songs);
        ListView songsView = findViewById(R.id.songlist);
        songsView.setAdapter(songsAdapter);
    }
}