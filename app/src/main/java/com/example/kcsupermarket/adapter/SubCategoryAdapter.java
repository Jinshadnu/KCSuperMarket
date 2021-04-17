package com.example.kcsupermarket.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kcsupermarket.R;
import com.example.kcsupermarket.databinding.LayoutCategoriesBinding;
import com.example.kcsupermarket.databinding.LayoutSubcategoryBinding;
import com.example.kcsupermarket.pojo.Categories;
import com.example.kcsupermarket.pojo.SubCategories;

import java.util.List;

import static android.view.LayoutInflater.from;

public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.SubcategoryViewHolder> {
    public Context context;
    public List<SubCategories> subCategoriesList;
    public LayoutInflater inflater;

    public SubCategoryAdapter(Context context, List<SubCategories>  subCategoriesList) {
        this.context = context;
        this.subCategoriesList = subCategoriesList;
    }

    @NonNull
    @Override
    public SubcategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutSubcategoryBinding categoriesBinding= DataBindingUtil.inflate(from(context), R.layout.layout_subcategory,parent,false);
        return new SubcategoryViewHolder(categoriesBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull SubcategoryViewHolder holder, int position) {
        SubCategories categories=subCategoriesList.get(position);
        holder.categoriesBinding.setSubcategory(categories);
    }

    @Override
    public int getItemCount() {
        return subCategoriesList.size();
    }

    public class SubcategoryViewHolder extends RecyclerView.ViewHolder {
        public LayoutSubcategoryBinding categoriesBinding;

        public SubcategoryViewHolder(@NonNull LayoutSubcategoryBinding categoriesBinding) {
            super(categoriesBinding.getRoot());
            this.categoriesBinding=categoriesBinding;
        }
    }
}
