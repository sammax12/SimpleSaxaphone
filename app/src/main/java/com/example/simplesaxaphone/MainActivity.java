package com.example.simplesaxaphone;


import simplesaxaphoneadapter.SimpleSaxophoneAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;

<<<<<<< HEAD
//import implementation "androidx.viewpager2:viewpager2:1.0.0";


public class MainActivity extends AppCompatActivity {

    private SimpleSaxophoneAdapter mainActivityAdapter = new SimpleSaxophoneAdapter(getSupportFragmentManager(), getLifecycle());
=======
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer timer;
>>>>>>> Alan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
                finish();
            }
        },2000);

    }


}


