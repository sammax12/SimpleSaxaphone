package fingerChart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.simplesaxaphone.FragmentDisplay;
import com.example.simplesaxaphone.R;


public class FingerChart10 extends Fragment {

    private Button C_btn, Csharp_btn, D_btn, Dsharp_btn, E_btn, F_btn, Fsharp_btn, G_btn, Gsharp_btn, Asharp_btn, B_btn, C_high_btn;
    private ImageButton forwardArrow_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_finger_chart10, container, false);


        C_btn = (Button) view.findViewById(R.id.C_btn);

        C_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(0);
            }
        });


        Csharp_btn = (Button) view.findViewById(R.id.Csharp_btn);

        Csharp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(1);
            }
        });


        D_btn = (Button) view.findViewById(R.id.D_btn);

        D_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(2);
            }
        });


        Dsharp_btn = (Button) view.findViewById(R.id.Dsharp_btn);

        Dsharp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(3);
            }
        });


        E_btn = (Button) view.findViewById(R.id.E_btn);

        E_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(4);
            }
        });


        F_btn = (Button) view.findViewById(R.id.F_btn);

        F_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(5);
            }
        });


        Fsharp_btn = (Button) view.findViewById(R.id.Fsharp_btn);

        Fsharp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(6);
            }
        });


        G_btn = (Button) view.findViewById(R.id.G_btn);

        G_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(7);
            }
        });


        Gsharp_btn = (Button) view.findViewById(R.id.Gsharp_btn);

        Gsharp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(8);
            }
        });


//        A_btn = (Button) view.findViewById(R.id.A_btn);
//
//        A_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ((FragmentDisplay)getActivity()).setViewPager(9);
//            }
//        });


        Asharp_btn = (Button) view.findViewById(R.id.Asharp_btn);

        Asharp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(10);
            }
        });


        B_btn = (Button) view.findViewById(R.id.B_btn);

        B_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(11);
            }
        });


        C_high_btn = (Button) view.findViewById(R.id.C_high_btn);

        C_high_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(12); // index missing
            }
        });

        forwardArrow_btn = (ImageButton) view.findViewById(R.id.forwardArrow_btn);

        forwardArrow_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay)getActivity()).setViewPager(13); // index missing
            }
        });

        return view;
    }
}