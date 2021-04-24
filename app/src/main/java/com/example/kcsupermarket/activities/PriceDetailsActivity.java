package com.example.kcsupermarket.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.databinding.ActivityPriceDetailsBinding;

public class PriceDetailsActivity extends AppCompatActivity {
 public ActivityPriceDetailsBinding priceDetailsBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        priceDetailsBinding= DataBindingUtil.setContentView(this,R.layout.activity_price_details);

        //priceDetailsBinding.layoutBase.textTitle.setText("Change Password");

        priceDetailsBinding.layoutBase.toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);

        priceDetailsBinding.layoutBase.toolbar.setNavigationOnClickListener(v -> {
            onBackPressed();
        });



    }
}