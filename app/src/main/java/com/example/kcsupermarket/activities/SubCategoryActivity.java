package com.example.kcsupermarket.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.adapter.ItemAdapter;
import com.example.kcsupermarket.adapter.SubCategoryAdapter;
import com.example.kcsupermarket.databinding.ActivitySubCategoryBinding;
import com.example.kcsupermarket.viewmodel.ItemsViewModel;
import com.example.kcsupermarket.viewmodel.SubCategoryViewModel;

public class SubCategoryActivity extends AppCompatActivity {
    public ActivitySubCategoryBinding subCategoryBinding;
    public SubCategoryViewModel subCategoryViewModel;
    public SubCategoryAdapter subCategoryAdapter;
    public ItemsViewModel itemsViewModel;
    public ItemAdapter itemAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        subCategoryBinding= DataBindingUtil.setContentView(this,R.layout.activity_sub_category);

        subCategoryViewModel=new ViewModelProvider(this).get(SubCategoryViewModel.class);
        itemsViewModel=new ViewModelProvider(this).get(ItemsViewModel.class);

        subCategoryBinding.recyclerSubcategories.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        subCategoryBinding.recyclerSubcategories.setHasFixedSize(true);

        subCategoryBinding.recyclerItems.setLayoutManager(new GridLayoutManager(this,2));
        subCategoryBinding.recyclerItems.setHasFixedSize(true);

        subCategoryBinding.layoutBase.toolbar.setTitle("Sub Category");

        subCategoryBinding.layoutBase.toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24);

        subCategoryBinding.layoutBase.toolbar.setNavigationOnClickListener(v -> {
            this.onBackPressed();
        });

        subCategoryBinding.textViewViewbasket.setOnClickListener(v -> {
         startActivity(new Intent(SubCategoryActivity.this,CartActivity.class));
        });

        getSubCategories();
        getItems();

    }

    private void getItems() {
        itemsViewModel.itemRepository.getItems().observe(this,items -> {
            itemAdapter=new ItemAdapter(this,items);
            subCategoryBinding.recyclerItems.setAdapter(itemAdapter);

        });
    }

    private void getSubCategories() {
        subCategoryViewModel.getSubCategories().observe(this,subCategories -> {
            subCategoryAdapter=new SubCategoryAdapter(this,subCategories);
            subCategoryBinding.recyclerSubcategories.setAdapter(subCategoryAdapter);
        });
    }
}