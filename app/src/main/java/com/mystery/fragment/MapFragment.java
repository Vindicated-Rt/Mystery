package com.mystery.fragment;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mystery.R;
import com.mystery.databinding.FragmentMapBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragment extends Fragment {

    private FragmentMapBinding mapBinding;

    public MapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mapBinding = DataBindingUtil
                .inflate(inflater,R.layout.fragment_map,container,false);
        return mapBinding.getRoot();
    }

}
