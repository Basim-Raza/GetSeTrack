package com.example.basimraza.vehiclestrackingsystem;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME =3000;
    private TextView splashText;
    private Intent intent;
    private Animation anime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
            }
        },SPLASH_TIME);

        splashText = (TextView) findViewById(R.id.splashText);
        anime = new AlphaAnimation(0.0f, 1.0f);
        anime.setDuration(3000);
        splashText.setAnimation(anime);
    }
}
