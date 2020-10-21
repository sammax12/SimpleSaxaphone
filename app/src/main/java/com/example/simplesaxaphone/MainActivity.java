package com.example.simplesaxaphone;


import simplesaxaphoneadapter.SimpleSaxophoneAdapter;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

import android.os.Bundle;

//import implementation "androidx.viewpager2:viewpager2:1.0.0";


public class MainActivity extends AppCompatActivity {

    private SimpleSaxophoneAdapter mainActivityAdapter = new SimpleSaxophoneAdapter(getSupportFragmentManager(), getLifecycle());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}


