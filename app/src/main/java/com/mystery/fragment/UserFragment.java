package com.mystery.fragment;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mystery.R;
import com.mystery.databinding.FragmentUserBinding;

public class UserFragment extends Fragment {

    private FragmentUserBinding userBinding;

    public UserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        userBinding = DataBindingUtil
                .inflate(inflater,R.layout.fragment_user,container,false);
        return userBinding.getRoot();
    }

}
