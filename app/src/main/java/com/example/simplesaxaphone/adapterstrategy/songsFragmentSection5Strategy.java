package com.example.simplesaxaphone.adapterstrategy;

import androidx.viewpager.widget.ViewPager;

import com.example.simplesaxaphone.SectionsStatePageAdapter;

import sampleSong.SampleSong5;

public class songsFragmentSection5Strategy implements IAdapterStrategy {
    @Override
    public void setAdapter(SectionsStatePageAdapter adapter, ViewPager viewPager) {
        adapter.addFragment(new SampleSong5());
        viewPager.setAdapter(adapter);
    }
}
