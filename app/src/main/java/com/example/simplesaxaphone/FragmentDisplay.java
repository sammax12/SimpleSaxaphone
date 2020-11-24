package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.simplesaxaphone.adapterstrategy.*;

public class FragmentDisplay extends AppCompatActivity {

    private static  SectionsStatePageAdapter adapter;
    private static ViewPager mViewPager;
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


    //Implementation of the Strategy Pattern.
    protected static void distinguishFragmentSection(String fragmentSection) {
        switch (fragmentSection) {
            case "lessonFragmentSettingUp":
                new IAdapterStrategyContext(new lessonFragmentSettingUpStrategy()).executeSetAdapter(adapter, mViewPager);
                break;

            case "chartFragmentSection":
                new IAdapterStrategyContext(new chartFragmentSectionStrategy()).executeSetAdapter(adapter, mViewPager);
                break;

            case "songsFragmentSection1":
                new IAdapterStrategyContext(new songsFragmentSection1Stratgey()).executeSetAdapter(adapter, mViewPager);
                break;

            case "songsFragmentSection2":
                new IAdapterStrategyContext(new songsFragmentSection2Strategy()).executeSetAdapter(adapter, mViewPager);
                break;

            case "songsFragmentSection3":
                new IAdapterStrategyContext(new songsFragmentSection3Strategy()).executeSetAdapter(adapter, mViewPager);
                break;

            case "songsFragmentSection4":
                new IAdapterStrategyContext(new songsFragmentSection4Strategy()).executeSetAdapter(adapter, mViewPager);
                break;

            case "songsFragmentSection5":
                new IAdapterStrategyContext(new songsFragmentSection5Strategy()).executeSetAdapter(adapter, mViewPager);
                break;

            case "lessonFragmentPosture":
                new IAdapterStrategyContext(new lessonFragmentPostureStrategy()).executeSetAdapter(adapter, mViewPager);
                break;

            case "lessonFragmentFirstNote":
                new IAdapterStrategyContext(new lessonFragmentFirstNoteStrategy()).executeSetAdapter(adapter, mViewPager);
                break;

            case "lessonFragmentMaintain":
                new IAdapterStrategyContext(new lessonFragmentMaintainStrategy()).executeSetAdapter(adapter, mViewPager);
                break;

            case "lessonFragmentReadingMusic":
                new IAdapterStrategyContext(new lessonFragmentReadingMusicStrategy()).executeSetAdapter(adapter, mViewPager);
                break;
        }
    }

    //Back press on the Android to back to the last fragment.
    @Override
    public void onBackPressed() {
        if (mViewPager.getCurrentItem() != 0) {
            mViewPager.setCurrentItem(mViewPager.getCurrentItem() - 1);
        }
        else{
            super.onBackPressed();
        }
    }
}