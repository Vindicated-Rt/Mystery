package com.mystery.model;

import android.content.Context;

/**
 * Created by Vindicated-Rt
 * 2020-02-19 16:59
 */
public class RegisterViewModel {
    private Context mContext;
    private RegisterModel mRegisterModel;

    public RegisterViewModel(Context context, RegisterModel registerModel) {
        this.mContext = context;
        this.mRegisterModel = registerModel;
    }
}
