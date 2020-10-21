package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class FragmentDisplay extends AppCompatActivity {

    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_display);

        fragmentTransaction = getSupportFragmentManager().beginTransaction();

        Test firstFrag = new Test();
        fragmentTransaction.replace(R.id.fragmentContainer,firstFrag);
        fragmentTransaction.commit();
    }
}