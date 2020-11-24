package sampleSong;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.simplesaxaphone.R;

public class PlaySong extends AppCompatActivity {

    private View view;
    private Button playBtn;
    private MediaPlayer player;
    private int song;

    public PlaySong(View view, int song){
        this.view = view;
        this.song = song;
    }

    public View createButtons(){
        playBtn = (Button) view.findViewById(R.id.playBtn);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(v);
            }
        });

        return view;
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

    @Override
    public void onBackPressed() {
        stopPlayer();
        super.onBackPressed();
    }

    @Override
    protected void onStop() {
        stopPlayer();
        super.onStop();

    }
}
