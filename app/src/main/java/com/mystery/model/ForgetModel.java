package com.mystery.model;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;

import com.mystery.R;

import androidx.databinding.ObservableField;

/**
 * Created by Vindicated-Rt
 * 2020-02-15 12:08
 */

public class ForgetModel {

    private Context mContext;
    private ObservableField<String> forgetTitle = new ObservableField<>();
    private ObservableField<String> forgetRemind = new ObservableField<>();

    public ForgetModel(Context context) {
        this.mContext = context;
        forgetTitle.set(mContext.getString(R.string.forget_password_text));
        forgetRemind.set(mContext.getString(R.string.type_forget_phone));
    }

    public ObservableField<String> getForgetTitle() {
        return forgetTitle;
    }

    public ObservableField<String> getForgetRemind() {
        return forgetRemind;
    }
}
