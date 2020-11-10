package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    private Button lessonbtn, fingeringChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lessonbtn = (Button) findViewById(R.id.buttonLesson);
        lessonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, FingerChart1.class);
                startActivity(intent);

                //Toast.makeText(Home.this, "Pressed!", Toast.LENGTH_SHORT).show();
            }
        });

        // This is the fingering chart button on the main menu.
        // This will do something when I click the button "Fingering Chart".
        fingeringChart = (Button) findViewById(R.id.buttonFingeringChart);
        fingeringChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Home.this, FragmentDisplay.class);

                // runs the onCreate function within the FragmentDisplay class
                startActivity(intent);
            }
        });

    }

}