package com.mystery.model;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;


import com.mystery.R;

import androidx.databinding.BaseObservable;
import androidx.databinding.ObservableField;

/**
 * Created by Vindicated-Rt
 * 2020-02-14 16:41
 */

public class LoginModel extends BaseObservable {

    private static final int emailMode = 0;
    private static final int phoneMode = 1;

    private Context mContext;
    private ObservableField<String> usernameText = new ObservableField<>();
    private ObservableField<String> passwordText = new ObservableField<>();
    private ObservableField<String> loginModeText = new ObservableField<>();
    private int loginMode;
    private Button area_code_btn, send_login_message_btn;


    public LoginModel(Context context, Button area_code_btn, Button send_login_message_btn) {
        this.mContext = context;
        this.loginMode = phoneMode;
        this.area_code_btn = area_code_btn;
        this.send_login_message_btn = send_login_message_btn;
        setLoginText();
    }

    public ObservableField<String> getUsernameText() {
        return usernameText;
    }

    public ObservableField<String> getPasswordText() {
        return passwordText;
    }

    public ObservableField<String> getLoginModeText() {
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
            usernameText.set(mContext.getString(R.string.phone_number_text));
            passwordText.set(mContext.getString(R.string.phone_code_text));
            loginModeText.set(mContext.getString(R.string.email_login_text));
            area_code_btn.setVisibility(View.VISIBLE);
            send_login_message_btn.setVisibility(View.VISIBLE);
        } else if (loginMode == emailMode) {
            usernameText.set(mContext.getString(R.string.email_text));
            passwordText.set(mContext.getString(R.string.password_text));
            loginModeText.set(mContext.getString(R.string.phone_login_text));
            area_code_btn.setVisibility(View.GONE);
            send_login_message_btn.setVisibility(View.GONE);
        }
    }

    /*邮件地址 & 手机号 监听*/
    public TextWatcher usernameWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };

    /*密码 & 验证码 监听*/
    public TextWatcher passwordWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}
