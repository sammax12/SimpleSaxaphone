package com.example.simplesaxaphone.adapterstrategy;

import androidx.viewpager.widget.ViewPager;

import com.example.simplesaxaphone.SectionsStatePageAdapter;

import firstNote.*;

public class lessonFragmentFirstNoteStrategy implements IAdapterStrategy {
    @Override
    public void setAdapter(SectionsStatePageAdapter adapter, ViewPager viewPager) {
        adapter.addFragment(new FirstNote1());
        adapter.addFragment(new FirstNote2());
        viewPager.setAdapter(adapter);
    }
}
