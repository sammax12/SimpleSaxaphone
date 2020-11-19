package sampleSong;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.simplesaxaphone.PlayMedia;
import com.example.simplesaxaphone.R;

public class SampleSong3 extends Fragment {

    private Button playBtn;
    private PlayMedia music;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_sample_song3, container, false );

        playBtn = (Button) view.findViewById(R.id.playBtn);
        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music = new PlayMedia(R.raw.twinkle_twinkle);
                music.play(v);
            }
        });

        return view;
    }
}