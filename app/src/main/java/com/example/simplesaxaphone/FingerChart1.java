package com.example.simplesaxaphone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


public class FingerChart1 extends Fragment {

    private Button Csharp_btn;
    private Button C_high_btn;
    private ImageButton forwardArrow_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_finger_chart1, container, false);

        Csharp_btn = (Button) view.findViewById(R.id.Csharp_btn);

        Csharp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(1);
            }
        });

        C_high_btn = (Button) view.findViewById(R.id.C_high_btn);

        C_high_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(2);
            }
        });

        forwardArrow_btn = (ImageButton) view.findViewById(R.id.forwardArrow_btn);

        forwardArrow_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(3);
            }
        });

        return view;
    }
}