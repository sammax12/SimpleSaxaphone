package com.example.simplesaxaphone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;


public class FingerChart14 extends Fragment {

    private Button C_btn, Csharp_btn, D_btn, Dsharp_btn, E_btn, F_btn, Fsharp_btn, G_btn, Gsharp_btn, A_btn, Asharp_btn, B_btn, C_high_btn;
    private ImageButton backArrow_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_finger_chart14, container, false);

//        C_btn = (Button) view.findViewById(R.id.C_btn);
//
//        C_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ((FragmentDisplay)getActivity()).setViewPager(13);
//            }
//        });


        Csharp_btn = (Button) view.findViewById(R.id.Csharp_btn);

        Csharp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("2nd CSHARP PRESSED");
                ((FragmentDisplay)getActivity()).setViewPager(14);
            }
        });


        D_btn = (Button) view.findViewById(R.id.D_btn);

        D_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(15);
            }
        });


        Dsharp_btn = (Button) view.findViewById(R.id.Dsharp_btn);

        Dsharp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(16);
            }
        });


        E_btn = (Button) view.findViewById(R.id.E_btn);

        E_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(17);
            }
        });


        F_btn = (Button) view.findViewById(R.id.F_btn);

        F_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(18);
            }
        });


        Fsharp_btn = (Button) view.findViewById(R.id.Fsharp_btn);

        Fsharp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(19);
            }
        });


        G_btn = (Button) view.findViewById(R.id.G_btn);

        G_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(20);
            }
        });


        Gsharp_btn = (Button) view.findViewById(R.id.Gsharp_btn);

        Gsharp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(21);
            }
        });


        A_btn = (Button) view.findViewById(R.id.A_btn);

        A_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(22);
            }
        });


        Asharp_btn = (Button) view.findViewById(R.id.Asharp_btn);

        Asharp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(23);
            }
        });


        B_btn = (Button) view.findViewById(R.id.B_btn);

        B_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(24);
            }
        });


        C_high_btn = (Button) view.findViewById(R.id.C_high_btn);

        C_high_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Last Note Page2 pressed");
                ((FragmentDisplay)getActivity()).setViewPager(25); // index missing
            }
        });



        backArrow_btn = (ImageButton) view.findViewById(R.id.backArrow_btn);

        backArrow_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(12);
            }
        });

        return view;
    }
}