package com.mystery.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.mystery.base.BaseUrl;
import com.mystery.R;

@Route(path = BaseUrl.ACTIVITY_URL_HOME)
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    /*初始化视图*/
    private void initView() {
        BottomNavigationView navBottom = findViewById(R.id.nav_bottom);
        FragmentManager fragmentManager = getSupportFragmentManager();
        NavHostFragment navHostFragment = (NavHostFragment) fragmentManager.findFragmentById(R.id.home_fragments);
        NavController navController = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(navBottom, navController);
    }
}
