package com.mystery.Activity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mystery.Base.BaseUrl;
import com.mystery.R;
import com.mystery.Util.SharedPreferencesUtil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

/**
 * Created by Vindicated-Rt
 * 2020-02-13 15:20
 */

@Route(path = BaseUrl.ACTIVITY_URL_SPLASH)
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final ImageView lunch_icon_iv = findViewById(R.id.lunch_icon_iv);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (SharedPreferencesUtil.getIsLogIn(SplashActivity.this)) {
                    ARouter.getInstance().build(BaseUrl.ACTIVITY_URL_LUNCH)
                            .withOptionsCompat(ActivityOptionsCompat
                                    .makeSceneTransitionAnimation(SplashActivity.this, lunch_icon_iv, "openLunch"))
                            .navigation(SplashActivity.this);
                    finish();
                } else {
                    ARouter.getInstance().build(BaseUrl.ACTIVITY_URL_HOME).navigation();
                    finish();
                }
            }
        }, 3000);
    }
}
