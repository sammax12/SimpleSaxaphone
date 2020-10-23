package com.example.simplesaxaphone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Maintaining4 extends Fragment {

    private Button finishBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_maintaining4, container, false);
        finishBtn = (Button) view.findViewById(R.id.finishBtn);
        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay) getActivity()).setViewPager( 4 );
            }
        });
        return view;
    }
}