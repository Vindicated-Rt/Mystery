package com.mystery.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mystery.Base.BaseUrl;
import com.mystery.R;

@Route(path = BaseUrl.ACTIVITY_URL_LOGIN)
public class LogInActivity extends AppCompatActivity {

    private Button forgetBtn;
    private TextView phoneNumberTv;
    private Button areaCodeBtn;
    private EditText phoneNumberEt;
    private Button sendLoginMessageBtn;
    private EditText loginCodeEt;
    private ImageView loginIv;
    private Button emailLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    public void closeLogin(View view) {
        ARouter.getInstance().build(BaseUrl.ACTIVITY_URL_LUNCH)
                .withOptionsCompat(ActivityOptionsCompat
                        .makeSceneTransitionAnimation(LogInActivity.this, forgetBtn, "openLogin"))
                .navigation(LogInActivity.this);
        finish();
    }

    /*初识化视图*/
    public void initView() {
        forgetBtn = findViewById(R.id.forget_btn);
        phoneNumberTv = findViewById(R.id.phone_number_tv);
        areaCodeBtn = findViewById(R.id.area_code_btn);
        phoneNumberEt = findViewById(R.id.phone_number_et);
        sendLoginMessageBtn = findViewById(R.id.send_login_message_btn);
        loginCodeEt = findViewById(R.id.login_code_et);
        loginIv = findViewById(R.id.login_iv);
        emailLoginBtn = findViewById(R.id.email_login_btn);

    }
}
