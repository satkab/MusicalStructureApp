package com.example.android.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_view, parent, false);
        }

        Song song = getItem(position);

        TextView songTitle = listItemView.findViewById(R.id.songtitle);
        assert song != null;
        songTitle.setText(song.getSongNameId());

        ImageView playImage = listItemView.findViewById(R.id.playimage);
        if (song.hasImage()) {
            playImage.setImageResource(song.getImageResourceId());
            playImage.setVisibility(View.VISIBLE);
        } else {
            playImage.setVisibility(View.GONE);
        }

        return listItemView;
    }
}