package com.mystery.model;

import com.mystery.fragment.HomeFragment;
import com.mystery.fragment.IntroductionFragment;
import com.mystery.fragment.MapFragment;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;

/**
 * Created by Vindicated-Rt
 * 2020-02-20 22:21
 */
public class HomeModel {

    private ArrayList<Fragment> fragments = new ArrayList<>();

    public HomeModel(){
        fragments.add(new IntroductionFragment());
        fragments.add(new MapFragment());
    }

    public ArrayList<Fragment> getFragments() {
        return fragments;
    }
}
