package com.example.simplesaxaphone.adapterstrategy;

import androidx.viewpager.widget.ViewPager;

import com.example.simplesaxaphone.SectionsStatePageAdapter;

import sampleSong.SampleSong4;

public class songsFragmentSection4Strategy implements IAdapterStrategy {
    @Override
    public void setAdapter(SectionsStatePageAdapter adapter, ViewPager viewPager) {
        adapter.addFragment(new SampleSong4());
        viewPager.setAdapter(adapter);
    }
}
