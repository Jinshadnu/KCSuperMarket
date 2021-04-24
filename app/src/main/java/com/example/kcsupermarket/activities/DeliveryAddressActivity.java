package com.example.kcsupermarket.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.databinding.ActivityDeliveryAddressBinding;

public class DeliveryAddressActivity extends AppCompatActivity {
 public ActivityDeliveryAddressBinding deliveryAddressBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        deliveryAddressBinding= DataBindingUtil.setContentView(this,R.layout.activity_delivery_address);

        deliveryAddressBinding.layoutBase.toolbar.setTitle("Delivery Address");

        deliveryAddressBinding.layoutBase.toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);

        deliveryAddressBinding.layoutBase.toolbar.setNavigationOnClickListener(v -> {
            onBackPressed();
        });

        deliveryAddressBinding.buttonAdd.setOnClickListener(v -> {
            startActivity(new Intent(DeliveryAddressActivity.this,AddressActivity.class));
        });
    }
}