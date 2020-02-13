package com.mystery.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mystery.Base.BaseUrl;
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
}
