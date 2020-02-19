package com.mystery.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by Vindicated-Rt
 * 2020-02-14 22:08
 * ARouter 初始化
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();
        ARouter.openDebug();
        ARouter.init(BaseApplication.this);
    }
}
