package com.beginurrev.burn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Set Toolbar for Home activity
        Toolbar mtoolbar = findViewById(R.id.homeToolbar);
        setSupportActionBar(mtoolbar);

    }
}
