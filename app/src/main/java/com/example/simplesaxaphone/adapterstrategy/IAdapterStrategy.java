package com.example.simplesaxaphone.adapterstrategy;

import androidx.viewpager.widget.ViewPager;

import com.example.simplesaxaphone.SectionsStatePageAdapter;

public interface IAdapterStrategy {
    public void setAdapter(SectionsStatePageAdapter adapter , ViewPager viewPager);
}
