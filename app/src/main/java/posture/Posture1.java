package posture;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.simplesaxaphone.FragmentDisplay;
import com.example.simplesaxaphone.R;

public class Posture1 extends Fragment {

    private Button continueBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_posture1, container, false);
        continueBtn = (Button) view.findViewById(R.id.continueBtn);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay) getActivity()).setViewPager( 1 );
            }
        });
        return view;
    }
}