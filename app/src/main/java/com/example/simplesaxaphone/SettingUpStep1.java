package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingUpStep1 extends AppCompatActivity {
    private Button continueBtn, menubtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_up_step1);
        continueBtn = (Button) findViewById(R.id.continueBtn);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( SettingUpStep1.this, SettingUpStep2.class);
                startActivity(intent);
            }
        });
        menubtn = (Button) findViewById(R.id.menubtn);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SettingUpStep1.this, Home.class);
                startActivity(intent);
            }
        });
    }
}