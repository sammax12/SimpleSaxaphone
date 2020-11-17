package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChartTranslation extends AppCompatActivity {

    private Button menubtn, contbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_translation);

        menubtn = (Button) findViewById(R.id.menubtn);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChartTranslation.this, Home.class);
                startActivity(intent);
            }
        });

        contbtn = (Button) findViewById(R.id.contbtn);
        contbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChartTranslation.this, FragmentDisplay.class);
                intent.putExtra("id", "chartFragmentSection");
                startActivity(intent);
            }
        });
    }
}