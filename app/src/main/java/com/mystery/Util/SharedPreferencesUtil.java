package com.mystery.Util;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by Vindicated-Rt
 * 2020-02-13 14:39
 */
public class SharedPreferencesUtil {

    public static boolean getIsLogIn(Context context){
        SharedPreferences sp = context.getSharedPreferences("login", MODE_PRIVATE);
        return sp.getBoolean("isLogIn",true);
    }

    public static void setIsLogIn(Context context,boolean isLogIn){
        SharedPreferences sp = context.getSharedPreferences("login", MODE_PRIVATE);
        sp.edit().putBoolean("isLogIn",isLogIn).apply();
    }
}
