package com.example.simplesaxaphone.adapterstrategy;

import androidx.viewpager.widget.ViewPager;

import com.example.simplesaxaphone.SectionsStatePageAdapter;

public class IAdapterStrategyContext {
    private IAdapterStrategy adapterStrategy;

    public IAdapterStrategyContext(IAdapterStrategy adapterStrategy) {
        this.adapterStrategy = adapterStrategy;
    }

    public void executeSetAdapter(SectionsStatePageAdapter adapter, ViewPager viewPager){
        adapterStrategy.setAdapter(adapter,viewPager);
    }
}
