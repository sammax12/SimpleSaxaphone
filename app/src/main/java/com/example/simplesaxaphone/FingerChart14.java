package com.example.simplesaxaphone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;


public class FingerChart14 extends Fragment {

    private ImageButton backArrow_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_finger_chart14, container, false);

        backArrow_btn = (ImageButton) view.findViewById(R.id.backArrow_btn);

        backArrow_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(2);
            }
        });

        return view;
    }
}