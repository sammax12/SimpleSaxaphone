package com.example.simplesaxaphone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fingerChart.*;
import com.example.simplesaxaphone.modifiedPagerAdapter.SectionsStatePageAdapter;

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

    private void distinguishFragmentSection(String fragmentSection){
        switch(fragmentSection){
            case "lessonFragmentSection":
            setupViewPagerLesson(mViewPager);
            break;

            case "chartFragmentSection":
            setupViewPagerChart(mViewPager);
            break;

            case "songsFragmentSection":
                setupViewPagerSongs(mViewPager);
            break;

        }
    }

    private void setupViewPagerLesson(ViewPager viewPager){

    }

    private void setupViewPagerChart(ViewPager viewPager){
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

    private void setupViewPagerSongs(ViewPager viewPager){
    }

    public void setViewPager(int fragmentNumber){
        mViewPager.setCurrentItem(fragmentNumber);
    }

    @Override
    public void onBackPressed(){
        if(mViewPager.getCurrentItem() == 0){
            super.onBackPressed();
        }
        else {
            mViewPager.setCurrentItem(mViewPager.getCurrentItem()-1);
        }
    }

}