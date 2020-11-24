package sampleSong;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.simplesaxaphone.R;

public class SampleSong5 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate( R.layout.fragment_sample_song5, container, false );

        PlaySong playSong = new PlaySong(view,R.raw.wheels_on_the_bus);

        return playSong.createButtons();
    }
}