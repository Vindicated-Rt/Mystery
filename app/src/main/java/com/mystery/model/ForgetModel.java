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
    private String phone_number;
    private String phone_code;
    private String remake_password;

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

    /*重制信息监听*/
    public TextWatcher remakeWatcher = new TextWatcher() {
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

    /*重制继续按钮*/
    public void remake() {
        if (checkPhone()) {
            forgetTitle.set(mContext.getString(R.string.type_phone_code));
            forgetRemind.set("我们向 " + phone_number + " 发送了一个短信验证码");
            if (checkCode()) {
                forgetTitle.set(mContext.getString(R.string.type_password));
                forgetRemind.set("请输入 " + phone_number + " 的新密码");
            }
        }
    }

    /*检测电话号码*/
    private boolean checkPhone() {
        return true;
    }

    /*检测电话号码*/
    private boolean checkCode() {
        return false;
    }
}
