package sampleSong;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.simplesaxaphone.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SampleSong3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SampleSong3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_sample_song3, container, false );
    }
}