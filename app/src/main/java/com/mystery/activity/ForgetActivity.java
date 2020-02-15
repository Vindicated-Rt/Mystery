package com.mystery.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mystery.R;
import com.mystery.base.BaseUrl;
import com.mystery.databinding.ActivityForgetBinding;

@Route(path = BaseUrl.ACTIVITY_URL_FORGET)
public class ForgetActivity extends AppCompatActivity {

    private ActivityForgetBinding forgetBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        forgetBinding = DataBindingUtil
                .setContentView(ForgetActivity.this, R.layout.activity_forget);
    }

    /*返回注册界面*/
    public void closeForget(View view) {
        onBackPressed();
    }
}
