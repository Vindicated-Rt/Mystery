package com.mystery.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mystery.Base.BaseUrl;
import com.mystery.R;

@Route(path = BaseUrl.ACTIVITY_URL_LUNCH)
public class LunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
    }
}
