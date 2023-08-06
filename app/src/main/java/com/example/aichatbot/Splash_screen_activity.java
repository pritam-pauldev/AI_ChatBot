package com.example.aichatbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_screen_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);

        Intent iHome = new Intent(Splash_screen_activity.this, MainActivity.class);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(iHome);
                finish();
            }
        }, 2730);


    }
}