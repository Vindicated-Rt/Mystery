package com.mystery.fragment;


import android.graphics.Color;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mystery.R;
import com.mystery.adapter.IntroViewPagerAdapter;
import com.mystery.databinding.FragmentIntroductionBinding;
import com.mystery.model.IntroductionModel;
import com.tmall.ultraviewpager.UltraViewPager;


public class IntroductionFragment extends Fragment {

    private FragmentIntroductionBinding introductionBinding;
    private IntroductionModel introductionModel;

    public IntroductionFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        introductionBinding = DataBindingUtil.inflate(inflater
                , R.layout.fragment_introduction, container, false);
        initView();
        return introductionBinding.getRoot();
    }

    /*初始化视图*/
    private void initView() {
        introductionModel = new IntroductionModel();
        introductionBinding.setIntroduction(introductionModel);
        initViewPager();
    }

    /*初始化ViewPager*/
    private void initViewPager() {
        introductionBinding.introVp.setAdapter(new IntroViewPagerAdapter());
        introductionBinding.introVp.initIndicator();
        introductionBinding.introVp.getIndicator()
                .setOrientation(UltraViewPager.Orientation.HORIZONTAL)
                .setFocusColor(Color.BLACK)
                .setNormalColor(Color.GRAY)
                .setRadius(
                        (int) TypedValue.applyDimension(
                                TypedValue.COMPLEX_UNIT_DIP, 5,
                                getResources().getDisplayMetrics()))
                .setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM)
                .build();
    }

}
