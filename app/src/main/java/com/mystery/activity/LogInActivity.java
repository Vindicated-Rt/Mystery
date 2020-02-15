package com.mystery.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mystery.base.BaseUrl;
import com.mystery.R;
import com.mystery.databinding.ActivityLoginBinding;
import com.mystery.model.LoginModel;

@Route(path = BaseUrl.ACTIVITY_URL_LOGIN)
public class LogInActivity extends AppCompatActivity {

    private LoginModel loginModel;
    private ActivityLoginBinding loginBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginBinding = DataBindingUtil
                .setContentView(LogInActivity.this,R.layout.activity_login);
        initView();
    }

    /*返回启动界面*/
    public void closeLogin(View view) {
        onBackPressed();
    }

    /*初识化视图*/
    public void initView() {
        loginModel = new LoginModel(this,loginBinding.areaCodeBtn,loginBinding.sendLoginMessageBtn);
        loginBinding.setLogin(loginModel);
    }

    /*启动忘记密码界面*/
    public void openForget(View view) {
        ARouter.getInstance().build(BaseUrl.ACTIVITY_URL_FORGET)
                .withOptionsCompat(ActivityOptionsCompat
                        .makeSceneTransitionAnimation(LogInActivity.this, view, "openForget"))
                .navigation(LogInActivity.this);
    }
}
