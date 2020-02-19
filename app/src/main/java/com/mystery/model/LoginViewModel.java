package com.mystery.model;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

import com.mystery.R;


/**
 * Created by Vindicated-Rt
 * 2020-02-19 16:59
 */
public class LoginViewModel {

    private Context mContext;
    private LoginModel mLoginModel;
    private Button area_code_btn, send_login_message_btn;

    public LoginViewModel(Context context, LoginModel loginModel
            , Button area_code_btn, Button send_login_message_btn) {
        this.mContext = context;
        this.mLoginModel = loginModel;
        this.area_code_btn = area_code_btn;
        this.send_login_message_btn = send_login_message_btn;
        setLoginText();
    }

    /*改变登录模式按钮*/
    public void changeLoginMode() {
        mLoginModel.setLoginMode(mLoginModel.getLoginMode());
        setLoginText();
    }

    /*设置登录界面文本*/
    private void setLoginText() {
        if (mLoginModel.getLoginMode() == LoginModel.phoneMode) {
            mLoginModel.getUsernameText().set(mContext.getString(R.string.phone_number_text));
            mLoginModel.getPasswordText().set(mContext.getString(R.string.phone_code_text));
            mLoginModel.getLoginModeText().set(mContext.getString(R.string.email_login_text));
            area_code_btn.setVisibility(View.VISIBLE);
            send_login_message_btn.setVisibility(View.VISIBLE);
        } else if (mLoginModel.getLoginMode() == LoginModel.emailMode) {
            mLoginModel.getUsernameText().set(mContext.getString(R.string.email_text));
            mLoginModel.getPasswordText().set(mContext.getString(R.string.password_text));
            mLoginModel.getLoginModeText().set(mContext.getString(R.string.phone_login_text));
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
