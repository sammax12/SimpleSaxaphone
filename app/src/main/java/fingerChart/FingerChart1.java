package fingerChart;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.simplesaxaphone.FragmentDisplay;
import com.example.simplesaxaphone.R;


public class FingerChart1 extends Fragment implements View.OnClickListener{

    private Button C_btn, Csharp_btn, D_btn, Dsharp_btn, E_btn, F_btn, Fsharp_btn, G_btn, Gsharp_btn, A_btn, Asharp_btn, B_btn, C_high_btn;
    private ImageButton forwardArrow_btn;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_finger_chart1, container, false);

        C_btn = (Button) view.findViewById(R.id.C_btn);
        C_btn.setOnClickListener(this);

        Csharp_btn = (Button) view.findViewById(R.id.Csharp_btn);
        Csharp_btn.setOnClickListener(this);

        D_btn = (Button) view.findViewById(R.id.D_btn);
        D_btn.setOnClickListener(this);

        Dsharp_btn = (Button) view.findViewById(R.id.Dsharp_btn);
        Dsharp_btn.setOnClickListener(this);

        E_btn = (Button) view.findViewById(R.id.E_btn);
        E_btn.setOnClickListener(this);

        F_btn = (Button) view.findViewById(R.id.F_btn);
        F_btn.setOnClickListener(this);

        Fsharp_btn = (Button) view.findViewById(R.id.Fsharp_btn);
        Fsharp_btn.setOnClickListener(this);

        G_btn = (Button) view.findViewById(R.id.G_btn);
        G_btn.setOnClickListener(this);

        Gsharp_btn = (Button) view.findViewById(R.id.Gsharp_btn);
        Gsharp_btn.setOnClickListener(this);

        A_btn = (Button) view.findViewById(R.id.A_btn);
        A_btn.setOnClickListener(this);

        Asharp_btn = (Button) view.findViewById(R.id.Asharp_btn);
        Asharp_btn.setOnClickListener(this);

        B_btn = (Button) view.findViewById(R.id.B_btn);
        B_btn.setOnClickListener(this);

        C_high_btn = (Button) view.findViewById(R.id.C_high_btn);
        C_high_btn.setOnClickListener(this);

        forwardArrow_btn = (ImageButton) view.findViewById(R.id.forwardArrow_btn);
        forwardArrow_btn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.C_btn:
                ((FragmentDisplay)getActivity()).setViewPager(0);
                break;
            case R.id.Csharp_btn:
                ((FragmentDisplay)getActivity()).setViewPager(1);
                break;
            case R.id.D_btn:
                ((FragmentDisplay)getActivity()).setViewPager(2);
                break;
            case R.id.Dsharp_btn:
                ((FragmentDisplay)getActivity()).setViewPager(3);
                break;
            case R.id.E_btn:
                ((FragmentDisplay)getActivity()).setViewPager(4);
                break;
            case R.id.F_btn:
                ((FragmentDisplay)getActivity()).setViewPager(5);
                break;
            case R.id.Fsharp_btn:
                ((FragmentDisplay)getActivity()).setViewPager(6);
                break;
            case R.id.G_btn:
                ((FragmentDisplay)getActivity()).setViewPager(7);
                break;
            case R.id.Gsharp_btn:
                ((FragmentDisplay)getActivity()).setViewPager(8);
                break;
            case R.id.A_btn:
                ((FragmentDisplay)getActivity()).setViewPager(9);
                break;
            case R.id.Asharp_btn:
                ((FragmentDisplay)getActivity()).setViewPager(10);
                break;
            case R.id.B_btn:
                ((FragmentDisplay)getActivity()).setViewPager(11);
                break;
            case R.id.C_high_btn:
                ((FragmentDisplay)getActivity()).setViewPager(12);
                break;
            case R.id.forwardArrow_btn:
                ((FragmentDisplay)getActivity()).setViewPager(13);
                break;
        }
    }
}