package com.example.android.musicalstructureapp;

class Song {

    private int mSongNameId;

    private int mImageResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    Song(int SongNameId, int imageResourceId) {
        mSongNameId = SongNameId;
        mImageResourceId = imageResourceId;
    }

    int getSongNameId() {
        return mSongNameId;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}