package com.example.simplesaxaphone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


public class FingerChart2 extends Fragment {

    private Button C_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_finger_chart2, container, false);

        C_btn = (Button) view.findViewById(R.id.C_btn);
        C_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(0);
            }
        });

        return view;
    }
}