package com.mystery.model;

import android.content.Context;
import android.view.View;
import android.widget.Button;


import com.mystery.R;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

/**
 * Created by Vindicated-Rt
 * 2020-02-14 16:41
 */

public class LoginModel extends BaseObservable {

    private static final int emailMode = 0;
    private static final int phoneMode = 1;

    private Context mContext;
    private String usernameText;
    private String passwordText;
    private String loginModeText;
    private int loginMode;
    private Button area_code_btn, send_login_message_btn;


    public LoginModel(Context context, Button area_code_btn, Button send_login_message_btn) {
        this.mContext = context;
        this.loginMode = phoneMode;
        this.area_code_btn = area_code_btn;
        this.send_login_message_btn = send_login_message_btn;
        setLoginText();
    }

    @Bindable
    public String getUsernameText() {
        return usernameText;
    }

    @Bindable
    public String getPasswordText() {
        return passwordText;
    }

    @Bindable
    public String getLoginModeText() {
        return loginModeText;
    }

    /*改变登录模式按钮*/
    public void changeLoginMode() {
        loginMode = loginMode ^ 1;
        setLoginText();
    }

    /*设置登录界面文本*/
    private void setLoginText() {
        if (loginMode == phoneMode) {
            usernameText = mContext.getString(R.string.phone_number_text);
            passwordText = mContext.getString(R.string.phone_code_text);
            loginModeText = mContext.getString(R.string.email_login_text);
            area_code_btn.setVisibility(View.VISIBLE);
            send_login_message_btn.setVisibility(View.VISIBLE);
        } else if (loginMode == emailMode) {
            usernameText = mContext.getString(R.string.email_text);
            passwordText = mContext.getString(R.string.password_text);
            loginModeText = mContext.getString(R.string.phone_login_text);
            area_code_btn.setVisibility(View.GONE);
            send_login_message_btn.setVisibility(View.GONE);
        }
        notifyPropertyChanged(BR.passwordText);
        notifyPropertyChanged(BR.usernameText);
        notifyPropertyChanged(BR.loginModeText);
    }


}
