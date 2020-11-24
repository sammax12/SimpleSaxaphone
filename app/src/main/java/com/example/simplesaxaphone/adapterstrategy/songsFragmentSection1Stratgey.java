package com.example.simplesaxaphone.adapterstrategy;

import androidx.viewpager.widget.ViewPager;

import com.example.simplesaxaphone.SectionsStatePageAdapter;

import sampleSong.SampleSong1;

public class songsFragmentSection1Stratgey implements IAdapterStrategy {
    @Override
    public void setAdapter(SectionsStatePageAdapter adapter, ViewPager viewPager) {
        adapter.addFragment(new SampleSong1());
        viewPager.setAdapter(adapter);
    }
}
