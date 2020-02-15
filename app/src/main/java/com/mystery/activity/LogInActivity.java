package com.mystery.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
    private Button areaCodeBtn;
    private Button sendLoginMessageBtn;

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
        areaCodeBtn = findViewById(R.id.area_code_btn);
        sendLoginMessageBtn = findViewById(R.id.send_login_message_btn);
        loginModel = new LoginModel(this,areaCodeBtn,sendLoginMessageBtn);
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
