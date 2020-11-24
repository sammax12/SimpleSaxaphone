package com.example.simplesaxaphone.adapterstrategy;

import androidx.viewpager.widget.ViewPager;

import com.example.simplesaxaphone.SectionsStatePageAdapter;

import posture.*;

public class lessonFragmentPostureStrategy implements IAdapterStrategy{
    @Override
    public void setAdapter(SectionsStatePageAdapter adapter, ViewPager viewPager) {
        adapter.addFragment(new Posture1());
        adapter.addFragment(new Posture2());
        adapter.addFragment(new Posture3());
        adapter.addFragment(new Posture4());
        viewPager.setAdapter(adapter);
    }
}
