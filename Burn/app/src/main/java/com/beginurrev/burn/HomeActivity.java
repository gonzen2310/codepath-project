package com.beginurrev.burn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Log.d(TAG, "onCreate: Start Home Activity");

        // Set Toolbar for Home activity
        Toolbar mtoolbar = findViewById(R.id.homeToolbar);

        // Get Title from Toolbar
        TextView toolbarTitle = findViewById(R.id.toolbarTitle);
        toolbarTitle.setText(getResources().getText(R.string.home_fragment));


        // Set Bottom Navigation Bar
        BottomNavigationViewEx mbottomNavigationViewEx = findViewById(R.id.bottomNavigationBar);
        mbottomNavigationViewEx.enableAnimation(false);
        mbottomNavigationViewEx.enableShiftingMode(false);
        mbottomNavigationViewEx.enableItemShiftingMode(false);
        mbottomNavigationViewEx.setTextVisibility(false);

    }
}
