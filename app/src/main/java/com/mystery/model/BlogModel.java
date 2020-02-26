package com.mystery.model;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableField;

/**
 * Created by Vindicated-Rt
 * 2020-02-21 15:06
 */
public class BlogModel {

    private ObservableField<String> blog_item_title = new ObservableField<>();
    private ObservableField<String> blog_item_author = new ObservableField<>();
    private ObservableField<String> blog_item_image_url = new ObservableField<>();

    public ObservableField<String> getBlog_item_title() {
        return blog_item_title;
    }

    public ObservableField<String> getBlog_item_author() {
        return blog_item_author;
    }

    public ObservableField<String> getBlog_item_image_url() {
        return blog_item_image_url;
    }

    @BindingAdapter({"imageUrl"})
    public static void imageUrl(ImageView imageView,String url){
        Glide.with(imageView.getContext())
                .load(url)
                .into(imageView);
    }
}
