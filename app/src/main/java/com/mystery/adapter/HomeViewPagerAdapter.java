package com.mystery.adapter;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * Created by Vindicated-Rt
 * 2020-02-22 09:24
 */
public class HomeViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> homeFragments;

    public HomeViewPagerAdapter(FragmentManager fm, int behavior,ArrayList<Fragment> fragments) {
        super(fm, behavior);
        this.homeFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return homeFragments.get(position);
    }

    @Override
    public int getCount() {
        return homeFragments.size();
    }
}
