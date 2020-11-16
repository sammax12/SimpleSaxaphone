package settingUp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.simplesaxaphone.FragmentDisplay;
import com.example.simplesaxaphone.R;

public class SettingUpStep7 extends Fragment {
    private Button finishBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_setting_up_step7, container, false);
        finishBtn = (Button) view.findViewById(R.id.finishBtn);
        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((FragmentDisplay) getActivity()).finish();
            }
        });
        return view;
    }
}