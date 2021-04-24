package com.example.kcsupermarket.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.adapter.MyOrderAdapter;
import com.example.kcsupermarket.databinding.ActivityHistoryBinding;
import com.example.kcsupermarket.viewmodel.HistoryViewModel;

public class HistoryActivity extends AppCompatActivity {
 public ActivityHistoryBinding historyBinding;
 public HistoryViewModel historyViewModel;
 public MyOrderAdapter orderAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        historyBinding= DataBindingUtil.setContentView(this,R.layout.activity_history);

        historyBinding.recyclerOrders.setLayoutManager(new GridLayoutManager(this,1));
        historyBinding.recyclerOrders.setHasFixedSize(true);

        historyBinding.layoutBase.toolbar.setTitle("My Orders");

        historyViewModel=new ViewModelProvider(this).get(HistoryViewModel.class);

        historyBinding.layoutBase.toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);

        historyBinding.layoutBase.toolbar.setNavigationOnClickListener(v -> {
            onBackPressed();
        });


        getOrders();


    }

    private void getOrders() {
        historyViewModel.getOrders().observe(this,myOrders -> {
            orderAdapter=new MyOrderAdapter(this,myOrders);
            historyBinding.recyclerOrders.setAdapter(orderAdapter);
        });
    }
}