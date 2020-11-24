package fingerChart;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.simplesaxaphone.FragmentDisplay;
import com.example.simplesaxaphone.R;


public class FingerChart2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_finger_chart2, container, false);

        FragmentDisplay fDisplay = ((FragmentDisplay)getActivity());

        LowChartButtons myButtons = new LowChartButtons(view,fDisplay);

        return myButtons.createButtons();

    }
}