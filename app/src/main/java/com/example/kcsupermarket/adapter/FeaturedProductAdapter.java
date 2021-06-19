package com.example.kcsupermarket.adapter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;


import com.example.kcsupermarket.R;
import com.example.kcsupermarket.databinding.LayoutOffersBinding;
import com.example.kcsupermarket.pojo.FeaturedProducts;

import java.util.List;

import static android.view.LayoutInflater.from;

public class FeaturedProductAdapter extends RecyclerView.Adapter<FeaturedProductAdapter.FeaturedViewHolder> {
    public Context context;
    public List<FeaturedProducts> featuredProductsList;

    public FeaturedProductAdapter(Context context, List<FeaturedProducts> featuredProductsList) {
        this.context = context;
        this.featuredProductsList = featuredProductsList;
    }


    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutOffersBinding subitemsBinding= DataBindingUtil.inflate(from(context), R.layout.layout_offers,parent,false);
        return new FeaturedProductAdapter.FeaturedViewHolder(subitemsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {
     FeaturedProducts featuredProducts=featuredProductsList.get(position);
     holder.offersBinding.setFeaturedproducts(featuredProducts);
    }

    @Override
    public int getItemCount() {
        return featuredProductsList.size();
    }

    public class FeaturedViewHolder extends RecyclerView.ViewHolder {
        public LayoutOffersBinding offersBinding;
        public FeaturedViewHolder(@NonNull LayoutOffersBinding offersBinding) {
            super(offersBinding.getRoot());
            this.offersBinding=offersBinding;

        }
    }
}
