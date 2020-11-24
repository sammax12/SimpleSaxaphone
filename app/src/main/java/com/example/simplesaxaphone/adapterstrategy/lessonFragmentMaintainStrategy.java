package com.example.simplesaxaphone.adapterstrategy;

import androidx.viewpager.widget.ViewPager;

import com.example.simplesaxaphone.SectionsStatePageAdapter;

import mainTaining.*;
public class lessonFragmentMaintainStrategy implements IAdapterStrategy {
    @Override
    public void setAdapter(SectionsStatePageAdapter adapter, ViewPager viewPager) {
        adapter.addFragment(new Maintaining1());
        adapter.addFragment(new Maintaining2());
        adapter.addFragment(new Maintaining3());
        adapter.addFragment(new Maintaining4());
        viewPager.setAdapter(adapter);
    }
}
