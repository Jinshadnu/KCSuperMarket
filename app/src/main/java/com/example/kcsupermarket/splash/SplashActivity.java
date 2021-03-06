package com.example.kcsupermarket.splash;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.kcsupermarket.MainActivity;
import com.example.kcsupermarket.R;
import com.example.kcsupermarket.databinding.ActivitySplashBinding;
import com.example.kcsupermarket.welcome.WelcomeActivity;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;
    public ActivitySplashBinding splashBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        splashBinding= DataBindingUtil.setContentView(this,R.layout.activity_splash);

        Animation animation= AnimationUtils.loadAnimation(this,R.anim.mytransition);

        splashBinding.imageView2.setAnimation(animation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, WelcomeActivity.class);
                startActivity(i);

                finish();

            }
        },SPLASH_TIME_OUT);


    }
}