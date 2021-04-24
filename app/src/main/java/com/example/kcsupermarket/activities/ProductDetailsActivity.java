package com.example.kcsupermarket.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.databinding.ActivityProductDetailsBinding;
import com.example.kcsupermarket.viewmodel.HistoryViewModel;

public class ProductDetailsActivity extends AppCompatActivity {
 public ActivityProductDetailsBinding productDetailsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        productDetailsBinding= DataBindingUtil.setContentView(this,R.layout.activity_product_details);

        productDetailsBinding.layoutBase.toolbar.setTitle("Product Details");


        productDetailsBinding.layoutBase.toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);

        productDetailsBinding.layoutBase.toolbar.setNavigationOnClickListener(v -> {
            onBackPressed();
        });


    }
}