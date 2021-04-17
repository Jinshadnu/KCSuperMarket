package com.example.kcsupermarket.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.activities.SubCategoryActivity;
import com.example.kcsupermarket.databinding.LayoutCategoriesBinding;
import com.example.kcsupermarket.pojo.Categories;

import java.util.List;

import static android.view.LayoutInflater.from;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    public Context context;
    public List<Categories> categoriesList;
    public LayoutInflater inflater;

    public CategoryAdapter(Context context, List<Categories> categoriesList) {
        this.context = context;
        this.categoriesList = categoriesList;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutCategoriesBinding categoriesBinding= DataBindingUtil.inflate(from(context), R.layout.layout_categories,parent,false);
        return new CategoryViewHolder(categoriesBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
     Categories categories=categoriesList.get(position);
     holder.categoriesBinding.setCategories(categories);
        holder.categoriesBinding.relativeCategories.setOnClickListener(v -> {
            context.startActivity(new Intent(context.getApplicationContext(), SubCategoryActivity.class));
        });
    }

    @Override
    public int getItemCount() {
        return categoriesList.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        public LayoutCategoriesBinding categoriesBinding;

        public CategoryViewHolder(@NonNull LayoutCategoriesBinding categoriesBinding) {
            super(categoriesBinding.getRoot());
            this.categoriesBinding=categoriesBinding;
        }
    }
}
