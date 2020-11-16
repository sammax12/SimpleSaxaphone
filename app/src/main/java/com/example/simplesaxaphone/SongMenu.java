package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import sampleSong.SampleSong1;
import sampleSong.SampleSong2;
import sampleSong.SampleSong3;
import sampleSong.SampleSong4;
import sampleSong.SampleSong5;

public class SongMenu extends AppCompatActivity {
    private Button happyBirthday, Mary, star, itsyBitsySpider, wheels, menubtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_menu);
        happyBirthday = (Button) findViewById(R.id.happyBirthday);
        happyBirthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongMenu.this, SampleSong1.class);
                startActivity(intent);
            }
        });
        Mary = (Button) findViewById(R.id.Mary);
        Mary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongMenu.this, SampleSong2.class);
                startActivity(intent);
            }
        });
        star = (Button) findViewById(R.id.star);
        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongMenu.this, SampleSong3.class);
                startActivity(intent);
            }
        });
        itsyBitsySpider = (Button) findViewById(R.id.itsyBitsySpider);
        itsyBitsySpider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongMenu.this, SampleSong4.class);
                startActivity(intent);
            }
        });
        wheels = (Button) findViewById(R.id.wheels);
        wheels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongMenu.this, SampleSong5.class);
                startActivity(intent);
            }
        });
        menubtn = (Button) findViewById(R.id.menubtn);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SongMenu.this, Home.class);
                startActivity(intent);
            }
        });
    }
}