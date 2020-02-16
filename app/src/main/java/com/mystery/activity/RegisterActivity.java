package com.mystery.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mystery.base.BaseUrl;
import com.mystery.R;

@Route(path = BaseUrl.ACTIVITY_URL_REGISTER)
public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void closeRegister(View view) {
        onBackPressed();
    }
}
