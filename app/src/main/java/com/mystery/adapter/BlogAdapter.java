package com.mystery.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mystery.R;
import com.mystery.databinding.LayoutBlogItemBinding;
import com.mystery.model.BlogModel;

import java.util.List;

import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Vindicated-Rt
 * 2020-02-26 11:12
 */
public class BlogAdapter extends RecyclerView.Adapter<BlogAdapter.BlogViewHolder> {

    private Context mContext;
    private List<BlogModel> blogModels;

    public BlogAdapter(Context context, List<BlogModel> blogModels) {
        this.mContext = context;
        this.blogModels = blogModels;
    }

    @Override
    public BlogViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutBlogItemBinding blogItemBinding = DataBindingUtil.inflate(
                LayoutInflater.from(mContext), R.layout.layout_blog_item, parent, false);
        BlogViewHolder blogViewHolder = new BlogViewHolder(blogItemBinding.getRoot());
        blogViewHolder.setRecycleItemBinding(blogItemBinding);
        return blogViewHolder;
    }

    @Override
    public void onBindViewHolder(BlogViewHolder holder, int position) {
        BlogModel blogModel = blogModels.get(position);
        holder.blogItemBinding.setBlogItem(blogModel);
        holder.blogItemBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return blogModels.size() > 0 ? blogModels.size() : 0;
    }

    public class BlogViewHolder extends RecyclerView.ViewHolder {

        private LayoutBlogItemBinding blogItemBinding;

        public void setRecycleItemBinding(LayoutBlogItemBinding blogItemBinding) {
            this.blogItemBinding = blogItemBinding;
        }

        public BlogViewHolder(View itemView) {
            super(itemView);
        }
    }

}
