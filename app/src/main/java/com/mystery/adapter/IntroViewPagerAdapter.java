package com.mystery.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


import com.mystery.R;

import androidx.viewpager.widget.PagerAdapter;

/**
 * Created by Vindicated-Rt
 * 2020-02-22 15:58
 */
@SuppressLint("InflateParams")
public class IntroViewPagerAdapter extends PagerAdapter {

    private int[] viewId = {
            R.mipmap.register_background,
            R.mipmap.forget_background,
            R.mipmap.login_background};

    public IntroViewPagerAdapter() {

    }

    @Override
    public int getCount() {
        return viewId.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LinearLayout linearLayout = (LinearLayout)
                LayoutInflater.from(container.getContext()).inflate(R.layout.layout_item,null);
        ImageView imageView = linearLayout.findViewById(R.id.item_pager_iv);
        imageView.setBackgroundResource(viewId[position]);
        container.addView(linearLayout);
        return linearLayout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        LinearLayout view = (LinearLayout) object;
        container.removeView(view);
    }
}
