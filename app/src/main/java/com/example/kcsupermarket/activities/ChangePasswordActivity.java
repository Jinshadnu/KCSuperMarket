package com.example.kcsupermarket.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.databinding.ActivityChangePasswordBinding;

public class ChangePasswordActivity extends AppCompatActivity {
public ActivityChangePasswordBinding changePasswordBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        changePasswordBinding= DataBindingUtil.setContentView(this,R.layout.activity_change_password);
        changePasswordBinding.layoutBase.toolbar.setTitle("Change Password");

        changePasswordBinding.layoutBase.toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);

        changePasswordBinding.layoutBase.toolbar.setNavigationOnClickListener(v -> {
            onBackPressed();
        });
    }
}