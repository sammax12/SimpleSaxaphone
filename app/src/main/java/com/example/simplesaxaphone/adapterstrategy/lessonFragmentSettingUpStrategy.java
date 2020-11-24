package com.example.simplesaxaphone.adapterstrategy;

import androidx.viewpager.widget.ViewPager;

import com.example.simplesaxaphone.SectionsStatePageAdapter;

import settingUp.*;

public class lessonFragmentSettingUpStrategy implements IAdapterStrategy {

    @Override
    public void setAdapter(SectionsStatePageAdapter adapter, ViewPager viewPager) {
        adapter.addFragment(new SettingUpStep1());
        adapter.addFragment(new SettingUpStep2());
        adapter.addFragment(new SettingUpStep3());
        adapter.addFragment(new SettingUpStep4());
        adapter.addFragment(new SettingUpStep5());
        adapter.addFragment(new SettingUpStep6());
        adapter.addFragment(new SettingUpStep7());
        viewPager.setAdapter(adapter);
    }
}
