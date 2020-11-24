package com.example.simplesaxaphone.adapterstrategy;

import androidx.viewpager.widget.ViewPager;

import com.example.simplesaxaphone.SectionsStatePageAdapter;

import readingMusic.*;

public class lessonFragmentReadingMusicStrategy implements IAdapterStrategy {
    @Override
    public void setAdapter(SectionsStatePageAdapter adapter, ViewPager viewPager) {
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
