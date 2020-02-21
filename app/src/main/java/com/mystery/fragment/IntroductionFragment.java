package com.mystery.fragment;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mystery.R;
import com.mystery.databinding.FragmentIntroductionBinding;


public class IntroductionFragment extends Fragment {

    private FragmentIntroductionBinding introductionBinding;

    public IntroductionFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        introductionBinding = DataBindingUtil.inflate(inflater
                ,R.layout.fragment_introduction,container,false);
        return introductionBinding.getRoot();
    }

}
