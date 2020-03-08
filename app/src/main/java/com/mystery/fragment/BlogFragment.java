package com.mystery.fragment;


import android.graphics.Rect;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mystery.R;
import com.mystery.adapter.BlogAdapter;
import com.mystery.databinding.FragmentBlogBinding;
import com.mystery.model.BlogModel;

import java.util.ArrayList;
import java.util.List;

public class BlogFragment extends Fragment {

    private FragmentBlogBinding blogBinding;
    private String[] tabData = {"全部", "我的"};

    public BlogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        blogBinding = DataBindingUtil
                .inflate(inflater, R.layout.fragment_blog, container, false);
        initView();
        return blogBinding.getRoot();
    }

    private void initView() {
        blogBinding.blogTopNavigation.setTabData(tabData);
        blogBinding.blogRv.setLayoutManager(new LinearLayoutManager(getContext()));
        List<BlogModel> blogModels = new ArrayList<>();
        BlogAdapter blogAdapter = new BlogAdapter(getContext(), blogModels);
        blogBinding.blogRv.setAdapter(blogAdapter);
        blogBinding.blogRv.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                if (parent.getChildAdapterPosition(view) == 0) {
                    outRect.top = 20;    //最上方item不设置间距
                }
                outRect.left = 20;
                outRect.bottom = 20;
                outRect.right = 20;
            }
        });
    }

}
