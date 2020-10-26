package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonsMenu extends AppCompatActivity {
    private Button settingUp, posture, firstNote, maintain, readingMusic, menubtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_menu);
        settingUp = (Button) findViewById(R.id.settingUp);
        settingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsMenu.this, SettingUpStep1.class);
                startActivity(intent);
            }
        });
        posture = (Button) findViewById(R.id.posture);
        posture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsMenu.this, Posture1.class);
                startActivity(intent);
            }
        });
        firstNote = (Button) findViewById(R.id.firstNote);
        firstNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsMenu.this, FirstNote1.class);
                startActivity(intent);
            }
        });
        maintain = (Button) findViewById(R.id.maintain);
        maintain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsMenu.this, Maintaining1.class);
                startActivity(intent);
            }
        });
        readingMusic = (Button) findViewById(R.id.readingMusic);
        readingMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsMenu.this, ReadingMusic1.class);
                startActivity(intent);
            }
        });
        menubtn = (Button) findViewById(R.id.menubtn);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LessonsMenu.this, Home.class);
                startActivity(intent);
            }
        });
    }
}