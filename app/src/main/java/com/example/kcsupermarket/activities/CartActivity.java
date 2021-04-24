package com.example.kcsupermarket.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.adapter.CartAdapter;
import com.example.kcsupermarket.databinding.ActivityCartBinding;
import com.example.kcsupermarket.viewmodel.CartViewModel;

public class CartActivity extends AppCompatActivity {
 public ActivityCartBinding cartBinding;
    public CartViewModel cartViewModel;
    public CartAdapter cartAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        cartBinding= DataBindingUtil.setContentView(this,R.layout.activity_cart);


        cartViewModel =
                new ViewModelProvider(this).get(CartViewModel.class);
        cartBinding.recyclerCart.setLayoutManager(new LinearLayoutManager(this));
        cartBinding.recyclerCart.setHasFixedSize(true);

        cartBinding.layoutBase.toolbar.setTitle("My Basket");


        cartBinding.layoutBase.toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);
        cartBinding.layoutBase.toolbar.setNavigationOnClickListener(v -> {
            onBackPressed();
        });

        cartBinding.buttonOrder.setOnClickListener(v -> {
            startActivity(new Intent(this, ShippingAddressActivity.class));
        });
        getCartItems();


    }

    public void getCartItems(){
        cartViewModel.getCartItems().observe(this,carts -> {
            cartAdapter=new CartAdapter(this,carts);
            cartBinding.recyclerCart.setAdapter(cartAdapter);
        });
    }

}