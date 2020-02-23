package com.mystery.design;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ExpandableListView;

/**
 * Created by Vindicated-Rt
 * 2020-02-23 17:57
 */
public class ScrollExpandableListView extends ExpandableListView {
    public ScrollExpandableListView(Context context) {
        super(context);
    }

    public ScrollExpandableListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ScrollExpandableListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mExpandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, mExpandSpec);
    }
}
