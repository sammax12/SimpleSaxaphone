package sampleSong;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.simplesaxaphone.R;


public class SampleSong4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate( R.layout.fragment_sample_song4, container, false );

        PlaySong playSong = new PlaySong(view,R.raw.itsy_bitsy);

        return playSong.createButtons();
    }
}