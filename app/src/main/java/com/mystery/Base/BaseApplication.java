package com.mystery.Base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by Vindicated-Rt
 * 2020-02-13 15:05
 * ARouter 初始化
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //上线时需要关闭
        ARouter.openLog();
        ARouter.openDebug();
        ARouter.init(BaseApplication.this);
    }
}
