package com.mystery.fragment;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.flyco.tablayout.listener.OnTabSelectListener;
import com.mystery.R;
import com.mystery.adapter.HomeViewPagerAdapter;
import com.mystery.databinding.FragmentHomeBinding;
import com.mystery.model.HomeModel;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding homeBinding;
    private String[] tabData = {"介绍", "地图"};
    private HomeModel homeModel;

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        homeBinding = DataBindingUtil
                .inflate(inflater, R.layout.fragment_home, container, false);
        initView();
        return homeBinding.getRoot();
    }

    /*初始化视图*/
    private void initView() {
        homeModel = new HomeModel();
        homeBinding.homeTopNavigation.setTabData(tabData);
        homeBinding.setHome(homeModel);
        HomeViewPagerAdapter homeViewPagerAdapter = new HomeViewPagerAdapter(
                getChildFragmentManager(),
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,
                homeModel.getFragments());
        homeBinding.homeVp.setAdapter(homeViewPagerAdapter);
        initTopNavigation();
    }

    /*初始化顶部导航监听*/
    private void initTopNavigation(){
        homeBinding.homeTopNavigation.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                homeBinding.homeVp.setCurrentItem(position);
            }

            @Override
            public void onTabReselect(int position) {

            }
        });
        homeBinding.homeVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                homeBinding.homeTopNavigation.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        homeBinding.homeVp.setCurrentItem(0);
    }
}
