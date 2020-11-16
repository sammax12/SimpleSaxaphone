package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonsMenu extends AppCompatActivity implements View.OnClickListener {
    private Button settingUp, posture, firstNote, maintain, readingMusic, menubtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_menu);

        settingUp = (Button) findViewById(R.id.settingUp);
        settingUp.setOnClickListener(this);
        posture = (Button) findViewById(R.id.posture);
        posture.setOnClickListener(this);
        firstNote = (Button) findViewById(R.id.firstNote);
        firstNote.setOnClickListener(this);
        maintain = (Button) findViewById(R.id.maintain);
        maintain.setOnClickListener(this);
        readingMusic = (Button) findViewById(R.id.readingMusic);
        readingMusic.setOnClickListener(this);

        menubtn = (Button) findViewById(R.id.menubtn);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsMenu.this, Home.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
        String value = null;

        switch (v.getId()){
            case R.id.settingUp:
                value = "lessonFragmentSettingUp";
                break;
            case R.id.posture:
                value = "lessonFragmentPosture";
                break;
            case R.id.firstNote:
                value = "lessonFragmentFirstNote";
                break;
            case R.id.maintain:
                value = "lessonFragmentMaintain";
                break;
            case R.id.readingMusic:
                value = "lessonFragmentReadingMusic";
                break;
        }

        Intent intent = new Intent(LessonsMenu.this, FragmentDisplay.class);
        intent.putExtra("id", value);
        startActivity(intent);
    }
}