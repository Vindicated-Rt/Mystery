package com.mystery.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mystery.base.BaseUrl;
import com.mystery.R;

@Route(path = BaseUrl.ACTIVITY_URL_LUNCH)
public class LunchActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
    }

    public void openLogin(View view) {
        ARouter.getInstance().build(BaseUrl.ACTIVITY_URL_LOGIN)
                .withOptionsCompat(ActivityOptionsCompat
                        .makeSceneTransitionAnimation(LunchActivity.this, view, "openLogin"))
                .navigation(LunchActivity.this);
    }

    public void openRegister(View view) {
        ARouter.getInstance().build(BaseUrl.ACTIVITY_URL_REGISTER)
                .withOptionsCompat(ActivityOptionsCompat
                        .makeSceneTransitionAnimation(LunchActivity.this, view, "openRegister"))
                .navigation(LunchActivity.this);
    }
}
