package com.example.kcsupermarket.register;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.databinding.ActivityRegisterBinding;
import com.example.kcsupermarket.home.HomeActivity;
import com.example.kcsupermarket.login.LoginActivity;

public class RegisterActivity extends AppCompatActivity {
    public ActivityRegisterBinding registerBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        registerBinding= DataBindingUtil.setContentView(this,R.layout.activity_register);
        registerBinding.textViewLogin.setOnClickListener(v -> {
            startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
        });

        registerBinding.buttonSubmit.setOnClickListener(v -> {
            startActivity(new Intent(RegisterActivity.this, HomeActivity.class));
        });
    }
}