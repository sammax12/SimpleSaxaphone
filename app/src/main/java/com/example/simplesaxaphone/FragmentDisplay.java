package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentDisplay extends AppCompatActivity {

    private SectionsStatePageAdapter adapter = new SectionsStatePageAdapter(getSupportFragmentManager());;
    private ViewPager fragViewPager;
    private Button menubtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_display);
        //Button
        menubtn = (Button) findViewById(R.id.menubtn);
        menubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FragmentDisplay.this, Home.class);
                startActivity(intent);
                adapter.removeAllContianInList();
            }
        });

        //Fragment Stuff

        fragViewPager = (ViewPager) findViewById(R.id.fragmentContainer);

        String data = getIntent().getExtras().getString("id");

        distinguishFragmentSection(data);
    }
    private void distinguishFragmentSection(String fragmentSection)
    {
        switch (fragmentSection){
            case "lessonFragmentSection":
                setupViewPagerLesson(fragViewPager);
                break;
            case "fingerFragmentSection":
                setupViewPagerFinger(fragViewPager);
                break;
            case "singerFragmentSection":
                setupViewPagerSong(fragViewPager);
                break;
        }
    }

    private void setupViewPagerLesson(ViewPager viewPager){
        adapter.addFragment(new Test(),"Test");
        adapter.addFragment(new test2(), "test2");
        viewPager.setAdapter(adapter);
    }

    private void setupViewPagerFinger(ViewPager viewPager){
        adapter.addFragment(new Test3(), "test3");
        viewPager.setAdapter(adapter);
    }

    private void setupViewPagerSong(ViewPager viewPager)
    {
        adapter.addFragment(new Test4(), "test4");
        viewPager.setAdapter(adapter);
    }

    public void setViewPager(int fragmentNumber){
        fragViewPager.setCurrentItem(fragmentNumber);
    }
}