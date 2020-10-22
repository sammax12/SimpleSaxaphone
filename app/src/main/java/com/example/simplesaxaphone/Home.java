package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    private Button lessonbtn;
    private  Button fingerbtn;
    private  Button singerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        lessonbtn = (Button) findViewById(R.id.buttonLesson);
        lessonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, FragmentDisplay.class);
                intent.putExtra("id", "lessonFragmentSection");
                startActivity(intent);
                //Toast.makeText(Home.this, "Pressed!", Toast.LENGTH_SHORT).show();
            }
        });

        fingerbtn = (Button) findViewById(R.id.buttonFingeringChart);
        fingerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, FragmentDisplay.class);
                intent.putExtra("id", "fingerFragmentSection");
                startActivity(intent);
                //Toast.makeText(Home.this, "Pressed!", Toast.LENGTH_SHORT).show();
            }
        });

        singerbtn = (Button) findViewById(R.id.buttonSampleSongs);
        singerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, FragmentDisplay.class);
                intent.putExtra("id", "singerFragmentSection");
                startActivity(intent);
                //Toast.makeText(Home.this, "Pressed!", Toast.LENGTH_SHORT).show();
            }
        });

    }

}