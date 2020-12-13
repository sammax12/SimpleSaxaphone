package sampleSong;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.simplesaxaphone.R;

public class SampleSong1 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate( R.layout.fragment_sample_song1, container, false );

        TextView clickTv = (TextView) view.findViewById(R.id.click_textView);

        clickTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               LinkAlertDialog.createAlert(getContext(), "https://www.8notes.com/scores/3032.asp");
            }
        });

        PlaySong playSong = new PlaySong(view,R.raw.happy_birthday);

        return playSong.createButtons();
    }

}