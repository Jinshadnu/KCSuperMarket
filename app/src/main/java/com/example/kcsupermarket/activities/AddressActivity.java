package com.example.kcsupermarket.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.databinding.ActivityAddressBinding;

public class AddressActivity extends AppCompatActivity {
 public ActivityAddressBinding addressBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addressBinding= DataBindingUtil.setContentView(this,R.layout.activity_address);

        addressBinding.layoutBase.toolbar.setTitle("New Address");

        addressBinding.layoutBase.toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);

        addressBinding.layoutBase.toolbar.setNavigationOnClickListener(v -> {
            onBackPressed();
        });
    }
}