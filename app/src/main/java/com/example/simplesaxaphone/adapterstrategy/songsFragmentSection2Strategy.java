package com.example.simplesaxaphone.adapterstrategy;

import androidx.viewpager.widget.ViewPager;

import com.example.simplesaxaphone.SectionsStatePageAdapter;

import sampleSong.SampleSong2;

public class songsFragmentSection2Strategy implements IAdapterStrategy{
    @Override
    public void setAdapter(SectionsStatePageAdapter adapter, ViewPager viewPager) {
        adapter.addFragment(new SampleSong2());
        viewPager.setAdapter(adapter);
    }
}
