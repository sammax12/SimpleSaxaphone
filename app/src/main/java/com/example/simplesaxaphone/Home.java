package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    private Button lessonbtn, chartbtn, songsbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lessonbtn = (Button) findViewById(R.id.buttonLesson);
        lessonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, LessonsMenu.class);
                startActivity(intent);
            }
        });

        chartbtn = (Button) findViewById(R.id.buttonFingeringChart);
        chartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, ChartTranslation.class);
                startActivity(intent);
            }
        });

        songsbtn = (Button) findViewById(R.id.buttonSampleSongs);
        songsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, SongMenu.class);
                startActivity(intent);
            }
        });
    }

}