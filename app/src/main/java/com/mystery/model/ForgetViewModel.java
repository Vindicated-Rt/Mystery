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
public class ForgetViewModel {

    private Context mContext;
    private ForgetModel mForgetModel;
    private String phone_number;
    private Button area_code_btn;
    private Boolean isTrueCode;
    private String phone_code;
    private String remake_password;

    public ForgetViewModel(Context context, ForgetModel forgetModel, Button area_code_btn) {
        this.mContext = context;
        this.mForgetModel = forgetModel;
        this.area_code_btn = area_code_btn;
        isTrueCode = false;
    }

    /*重制继续按钮*/
    public void remake() {
        if (checkPhone()) {
            mForgetModel.getForgetTitle().set(mContext.getString(R.string.type_phone_code));
            mForgetModel.getForgetRemind().set("我们向 " + phone_number + " 发送了一个短信验证码");
            area_code_btn.setVisibility(View.GONE);
            if (checkCode()) {
                mForgetModel.getForgetTitle().set(mContext.getString(R.string.type_password));
                mForgetModel.getForgetRemind().set("请输入 " + phone_number + " 的新密码");
            }
            isTrueCode = true;
        }
    }

    /*检测电话号码*/
    private boolean checkPhone() {
        return true;
    }

    /*检测电话号码*/
    private boolean checkCode() {
        return isTrueCode;
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
            phone_number = String.valueOf(editable);
        }
    };
}
