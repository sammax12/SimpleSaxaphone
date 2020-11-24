package fingerChart;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.simplesaxaphone.FragmentDisplay;
import com.example.simplesaxaphone.R;

public class HighChartButtons extends Fragment implements View.OnClickListener{
    private View view;
    private FragmentDisplay fDisplay;
    private Button C_btn, Csharp_btn, D_btn, Dsharp_btn, E_btn, F_btn, Fsharp_btn, G_btn, Gsharp_btn, A_btn, Asharp_btn, B_btn, C_high_btn;
    private ImageButton backArrow_btn;

    public HighChartButtons(View view, FragmentDisplay fDisplay){
        this.view = view;
        this.fDisplay = fDisplay;
    }

    public View createButtons() {
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

        backArrow_btn = (ImageButton) view.findViewById(R.id.backArrow_btn);
        backArrow_btn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.C_btn:
                fDisplay.setViewPager(13);
                break;
            case R.id.Csharp_btn:
                fDisplay.setViewPager(14);
                break;
            case R.id.D_btn:
                fDisplay.setViewPager(15);
                break;
            case R.id.Dsharp_btn:
                fDisplay.setViewPager(16);
                break;
            case R.id.E_btn:
                fDisplay.setViewPager(17);
                break;
            case R.id.F_btn:
                fDisplay.setViewPager(18);
                break;
            case R.id.Fsharp_btn:
                fDisplay.setViewPager(19);
                break;
            case R.id.G_btn:
                fDisplay.setViewPager(20);
                break;
            case R.id.Gsharp_btn:
                fDisplay.setViewPager(21);
                break;
            case R.id.A_btn:
                fDisplay.setViewPager(22);
                break;
            case R.id.Asharp_btn:
                fDisplay.setViewPager(23);
                break;
            case R.id.B_btn:
                fDisplay.setViewPager(24);
                break;
            case R.id.C_high_btn:
                fDisplay.setViewPager(25);
                break;
            case R.id.backArrow_btn:
                fDisplay.setViewPager(12);
                break;
        }
    }

}
