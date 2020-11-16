package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fingerChart.*;
import firstNote.*;
import mainTaining.*;
import posture.*;
import readingMusic.*;
import sampleSong.*;
import settingUp.*;

public class FragmentDisplay extends AppCompatActivity {

    private SectionsStatePageAdapter adapter;
    private ViewPager mViewPager;
    private String data;
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
                adapter.removeAllContainInList();
            }
        });


        //Fragment Stuff
        adapter = new SectionsStatePageAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.fragmentContainer);

        data = getIntent().getExtras().getString("id");

        distinguishFragmentSection(data);
    }

    public void setViewPager(int fragmentNumber) {
        mViewPager.setCurrentItem(fragmentNumber);
    }

    protected void distinguishFragmentSection(String fragmentSection) {
        switch (fragmentSection) {
            case "lessonFragmentSettingUp":
                lessonFragmentSettingUp(mViewPager);
                break;

            case "chartFragmentSection":
                setupViewPagerChart(mViewPager);
                break;

            case "songsFragmentSection":
                setupViewPagerSongs(mViewPager);
                break;

            case "lessonFragmentPosture":
                lessonFragmentPosture(mViewPager);
                break;

            case "lessonFragmentFirstNote":
                lessonFragmentFirstNote(mViewPager);
                break;

            case "lessonFragmentMaintain":
                lessonFragmentMaintain(mViewPager);
                break;

            case "lessonFragmentReadingMusic":
                lessonFragmentReadingMusic(mViewPager);
                break;

        }
    }

    private void lessonFragmentSettingUp(ViewPager viewPager) {
        adapter.addFragment(new SettingUpStep1());
        adapter.addFragment(new SettingUpStep2());
        adapter.addFragment(new SettingUpStep3());
        adapter.addFragment(new SettingUpStep4());
        adapter.addFragment(new SettingUpStep5());
        adapter.addFragment(new SettingUpStep6());
        adapter.addFragment(new SettingUpStep7());
        viewPager.setAdapter(adapter);
    }

    private void setupViewPagerChart(ViewPager viewPager) {
        adapter.addFragment(new FingerChart1());
        adapter.addFragment(new FingerChart2());
        adapter.addFragment(new FingerChart3());
        adapter.addFragment(new FingerChart4());
        adapter.addFragment(new FingerChart5());
        adapter.addFragment(new FingerChart6());
        adapter.addFragment(new FingerChart7());
        adapter.addFragment(new FingerChart8());
        adapter.addFragment(new FingerChart9());
        adapter.addFragment(new FingerChart10());
        adapter.addFragment(new FingerChart11());
        adapter.addFragment(new FingerChart12());
        adapter.addFragment(new FingerChart13());
        adapter.addFragment(new FingerChart14());
        adapter.addFragment(new FingerChart15());
        adapter.addFragment(new FingerChart16());
        adapter.addFragment(new FingerChart17());
        adapter.addFragment(new FingerChart18());
        adapter.addFragment(new FingerChart19());
        adapter.addFragment(new FingerChart20());
        adapter.addFragment(new FingerChart21());
        adapter.addFragment(new FingerChart22());
        adapter.addFragment(new FingerChart23());
        adapter.addFragment(new FingerChart24());
        adapter.addFragment(new FingerChart25());
        adapter.addFragment(new FingerChart26());
        viewPager.setAdapter(adapter);
    }

    private void setupViewPagerSongs(ViewPager viewPager) {
        adapter.addFragment(new SampleSong1());
        adapter.addFragment(new SampleSong2());
        adapter.addFragment(new SampleSong3());
        adapter.addFragment(new SampleSong4());
        adapter.addFragment(new SampleSong5());
        viewPager.setAdapter(adapter);
    }

    private void lessonFragmentPosture(ViewPager viewPager){
        adapter.addFragment(new Posture1());
        adapter.addFragment(new Posture2());
        adapter.addFragment(new Posture3());
        adapter.addFragment(new Posture4());
        viewPager.setAdapter(adapter);
    }

    private void lessonFragmentFirstNote(ViewPager viewPager){
        adapter.addFragment(new FirstNote1());
        adapter.addFragment(new FirstNote2());
        viewPager.setAdapter(adapter);
    }

    private void lessonFragmentMaintain(ViewPager viewPager) {
        //adapter.addFragment(new Maintaining1());
       // adapter.addFragment(new Maintaining2());
        adapter.addFragment(new Maintaining3());
        adapter.addFragment(new Maintaining4());
        viewPager.setAdapter(adapter);
    }

    private void lessonFragmentReadingMusic(ViewPager viewPager) {
        adapter.addFragment(new ReadingMusic1());
        adapter.addFragment(new ReadingMusic2());
        adapter.addFragment(new ReadingMusic3());
        adapter.addFragment(new ReadingMusic4());
        adapter.addFragment(new ReadingMusic5());
        adapter.addFragment(new ReadingMusic6());
        adapter.addFragment(new ReadingMusic7());
        adapter.addFragment(new ReadingMusic8());
        adapter.addFragment(new ReadingMusic9());
        adapter.addFragment(new ReadingMusic10());
        adapter.addFragment(new ReadingMusic11());
        adapter.addFragment(new ReadingMusic12());
        viewPager.setAdapter(adapter);
    }
}