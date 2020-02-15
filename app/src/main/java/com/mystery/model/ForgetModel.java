package com.mystery.model;

import android.content.Context;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

/**
 * Created by Vindicated-Rt
 * 2020-02-15 12:08
 */

public class ForgetModel extends BaseObservable {

    private Context mContext;
    private ObservableField<String> forgetTitle = new ObservableField<>();
    private ObservableField<String> forgetRemind = new ObservableField<>();
    private String phone_number;

    public ForgetModel (Context context){
        this.mContext = context;
    }

    public ObservableField<String> getForgetTitle() {
        return forgetTitle;
    }

    public ObservableField<String> getForgetRemind() {
        return forgetRemind;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    /*重制继续按钮*/
    public void remake(){

    }
}
