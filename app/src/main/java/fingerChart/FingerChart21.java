package fingerChart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.simplesaxaphone.FragmentDisplay;
import com.example.simplesaxaphone.R;


public class FingerChart21 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_finger_chart21, container, false);

        FragmentDisplay fDisplay = ((FragmentDisplay)getActivity());

        HighChartButtons myButtons = new HighChartButtons(view,fDisplay);

        return myButtons.createButtons();
    }
}