package com.example.simplesaxaphone.adapterstrategy;

import androidx.viewpager.widget.ViewPager;

import com.example.simplesaxaphone.SectionsStatePageAdapter;

import fingerChart.*;

public class chartFragmentSectionStrategy implements IAdapterStrategy{

    @Override
    public void setAdapter(SectionsStatePageAdapter adapter, ViewPager viewPager) {
        adapter.addFragment(new FingerChart1());
        adapter.addFragment(new FingerChart2());
        adapter.addFragment(new FingerChart3());
        adapter.addFragment(new FingerChart4());
        adapter.addFragment(new FingerChart5());
        adapter.addFragment(new FingerChart6());
        adapter.addFragment(new FingerChart7());
        adapter.addFragment(new FingerChart8());
        adapter.addFragment(new FingerChart9());
        adapter.addFragment(new FingerChart10());
        adapter.addFragment(new FingerChart11());
        adapter.addFragment(new FingerChart12());
        adapter.addFragment(new FingerChart13());
        adapter.addFragment(new FingerChart14());
        adapter.addFragment(new FingerChart15());
        adapter.addFragment(new FingerChart16());
        adapter.addFragment(new FingerChart17());
        adapter.addFragment(new FingerChart18());
        adapter.addFragment(new FingerChart19());
        adapter.addFragment(new FingerChart20());
        adapter.addFragment(new FingerChart21());
        adapter.addFragment(new FingerChart22());
        adapter.addFragment(new FingerChart23());
        adapter.addFragment(new FingerChart24());
        adapter.addFragment(new FingerChart25());
        adapter.addFragment(new FingerChart26());
        viewPager.setAdapter(adapter);
    }
}

