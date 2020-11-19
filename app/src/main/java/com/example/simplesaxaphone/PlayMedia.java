package com.example.simplesaxaphone;

import android.media.MediaPlayer;
import android.view.View;


public class PlayMedia{
    private MediaPlayer player;
    public int song;

    public PlayMedia(int song){
        this.song = song;
    }

    public void play(View v){
        if(player == null){
            player = MediaPlayer.create(v.getContext(), song);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener(){
                @Override
                public void onCompletion(MediaPlayer mp){
                    stopPlayer();
                }
            });
        }
        player.start();
    }

    private void stopPlayer(){
        if(player != null){
            player.release();
            player = null;
        }
    }

}
