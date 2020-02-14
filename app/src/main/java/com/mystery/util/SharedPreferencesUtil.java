package com.mystery.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Vindicated-Rt
 * 2020-02-14 22:09
 */
public class SharedPreferencesUtil {

    public static boolean getIsLogIn(Context context) {
        SharedPreferences sp = context.getSharedPreferences("login", Context.MODE_PRIVATE);
        return sp.getBoolean("isLogIn", true);
    }

    public static void setIsLogIn(Context context, boolean isLogIn) {
        SharedPreferences sp = context.getSharedPreferences("login", Context.MODE_PRIVATE);
        sp.edit().putBoolean("isLogIn", isLogIn).apply();
    }

}
