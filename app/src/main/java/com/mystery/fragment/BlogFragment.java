package com.mystery.fragment;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mystery.R;
import com.mystery.databinding.FragmentBlogBinding;

public class BlogFragment extends Fragment {

    private FragmentBlogBinding blogBinding;

    public BlogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        blogBinding = DataBindingUtil
                .inflate(inflater,R.layout.fragment_blog,container,false);
        initView();
        return blogBinding.getRoot();
    }

    private void initView(){

    }

}
