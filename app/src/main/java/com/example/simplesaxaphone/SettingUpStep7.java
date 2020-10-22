package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingUpStep7 extends AppCompatActivity {
    private Button finishBtn, menubtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_setting_up_step7 );
        finishBtn = (Button) findViewById( R.id.finishBtn );
        finishBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( SettingUpStep7.this, LessonsMenu.class );
                startActivity( intent );
            }
        } );
        menubtn = (Button) findViewById( R.id.menubtn );
        menubtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( SettingUpStep7.this, Home.class );
                startActivity( intent );
            }
        } );
    }
}