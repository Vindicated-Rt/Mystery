package com.mystery.model;

import androidx.databinding.ObservableField;

/**
 * Created by Vindicated-Rt
 * 2020-02-14 16:41
 */

public class LoginModel {

    public static final int emailMode = 0;
    public static final int phoneMode = 1;
    private ObservableField<String> usernameText = new ObservableField<>();
    private ObservableField<String> passwordText = new ObservableField<>();
    private ObservableField<String> loginModeText = new ObservableField<>();
    private int loginMode;


    public LoginModel() {
        this.loginMode = phoneMode;
    }

    public ObservableField<String> getUsernameText() {
        return usernameText;
    }

    public ObservableField<String> getPasswordText() {
        return passwordText;
    }

    public ObservableField<String> getLoginModeText() {
        return loginModeText;
    }

    public int getLoginMode() {
        return loginMode;
    }

    public void setLoginMode(int loginMode) {
        if (loginMode == phoneMode) {
            this.loginMode = emailMode;
        } else {
            this.loginMode = phoneMode;
        }
    }
}
