package com.beginurrev.burn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Set Toolbar for Home activity
        Toolbar mtoolbar = findViewById(R.id.homeToolbar);
        setSupportActionBar(mtoolbar);

        // Set Bottom Navigation Bar
        BottomNavigationViewEx mbottomNavigationViewEx = findViewById(R.id.bottomNavigationBar);
        mbottomNavigationViewEx.enableAnimation(false);
        mbottomNavigationViewEx.enableShiftingMode(false);
        mbottomNavigationViewEx.enableItemShiftingMode(false);

    }
}
